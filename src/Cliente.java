// Ultilizando Composição para reultilização de código.
public class Cliente implements Autenticavel{

	private AutenticacaoUtil autenticador;

	// Cria um obejeto com os métodos autentica e set senha quando CLiente é criado.
	public Cliente(){
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
