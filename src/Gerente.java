
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}
	
	public boolean autentica(int senha) {

		if (this.senha > 0) {
			if (this.senha == senha) {
				System.out.println("Senha Correta!\n   Entrou!");
				return true;
			}else {
				System.out.println("Senha incorreta!");
				return false;
			}
		}
		
		System.out.println("Cadastre uma Senha para este Usuario!" + 
						   "\n( A senha deve ser maior que 0 )");
		return false;
	}
	
	public double getBonificacao(){
		System.out.println("Bonificação do Gerente");
		return super.getSalario() + super.getBonificacao();
	}
}
