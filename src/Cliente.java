public class Cliente implements Autenticavel{

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senhaASerVerificada) {

		if (senhaASerVerificada > 0) {
			if (this.senha == senhaASerVerificada) {
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
}