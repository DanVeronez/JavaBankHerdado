public abstract interface Autenticavel{ 

	public abstract void setSenha(int senha);
	
	boolean autentica(int senhaASerVerificada);

}
