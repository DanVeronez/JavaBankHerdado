
public class TesteReferencias {
	 public static void main(String[] args) {

	        Gerente g1 = new Gerente();
	        g1.setNome("Marcos");
	        g1.setSalario(5000.0);

			//Funcionario agora é abstrato e não pode ser instanciado
	        // Funcionario f = new Funcionario();
	        // f.setSalario(2000.0);
	        
	        EditorDeVideo ev = new EditorDeVideo();
	        ev.setSalario(2500.0);

	        Designer d = new Designer();
	        d.setSalario(2000.0);

	        ControleBonificacao controle = new ControleBonificacao();
	        controle.registra(g1);
	        // controle.registra(f);
	        controle.registra(ev);
	        controle.registra(d);
	        System.out.println("Soma da Bonificacao de todos dos Funcionarios: R$ " + controle.getSoma());
	    }
}
