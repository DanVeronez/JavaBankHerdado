//Gerente eh um funcionario, ele Herda da classe funcionario
public class Gerente extends Funcionario {

	private int senhaDoGerente;

	public void setSenha(int senhaDoGerente) {
		this.senhaDoGerente = senhaDoGerente;
	}

	public int getSenha() {
		return senhaDoGerente;
	}
	
	public boolean autentica(int senhaASerVerificada) {

		if (senhaASerVerificada > 0) {
			if (this.senhaDoGerente == senhaASerVerificada) {
				System.out.println("Senha Correta!\n   Entrou!");
				return true;
			}else {
				System.out.println("Senha incorreta!");
				return false;
			}
		}
		
		System.out.println("Cadastre uma Senha Numerica para este Usuario!" + 
						   "\n( A senha deve ser maior que 0 )");
		return false;
	}

	@Override
	public double getBonificacao() {
		System.out.println("Chama o metodo de Bonificacao do Gerente");
		return super.getSalario();
	}
}
