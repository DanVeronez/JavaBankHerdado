public class FuncionarioAutenticavel extends Funcionario{

    private int senha = 2222;

    public void autentica(Gerente g){

        boolean autenticou = g.autentica(this.senha);
        
        if(autenticou){
            System.out.println("Pode entrar no sistema");
        }else{
            System.out.println("Não pode entar no sistema");
        }
    }

    @Override
    public double getBonificacao() {
        // TODO Auto-generated method stub
        return 0;
    }
}
