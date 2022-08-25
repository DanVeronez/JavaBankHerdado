//Design eh um funcionario, ele Herda da classe funcionario
public class Designer extends Funcionario{

	@Override
	public double getBonificacao() {
		System.out.println("Chama o metodo de Bonificacao do Designer");
		return 200.0;
	}
}
