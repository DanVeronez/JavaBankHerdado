//Editor De Video eh um funcionario, ele Herda da classe funcionario
public class EditorDeVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chama o metodo de Bonificacao do Editor de Video");
		return 150.0;
	}
}
