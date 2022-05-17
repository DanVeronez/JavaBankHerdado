
public class EditorDeVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Bonificação do Editor de Video");
		return super.getBonificacao() + 150.0;
	}
}
