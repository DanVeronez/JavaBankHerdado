
public class EditorDeVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Bonifica��o do Editor de Video");
		return super.getBonificacao() + 150.0;
	}
}
