//Administrador eh um funcionario Autenticavel, ele Herda da classe funcionario autenticavel que herda da classe funcionario
public class Administrador extends Funcionario implements Autenticavel{

    @Override
    public double getBonificacao() {
        return 50;
    }

	private AutenticacaoUtil autenticador;

	public Administrador(){
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
