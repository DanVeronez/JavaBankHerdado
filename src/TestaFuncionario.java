
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario andre = new Funcionario();
		andre.setNome("Andre Soares");
		andre.setCpf("111.111.111-11");
		andre.setSalario(5000);
		
		System.out.println("Nome:        " + andre.getNome() + 
						 "\nCPF:         " + andre.getCpf() + 
						 "\nSalario:     R$ " + andre.getSalario() + 
						 "\nBonifica��o: R$ " + andre.getBonificacao());

	}
}
