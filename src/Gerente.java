//Gerente eh um funcionario , ele Herda da classe funcionario, assina contrato com autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonificacao() {
		System.out.println("Chama o metodo de Bonificacao do Gerente");
		return super.getSalario();
	}

	private AutenticacaoUtil autenticador;

	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senhaASerVerificada) {
		return this.autenticador.autentica(senhaASerVerificada);
    }    
}
