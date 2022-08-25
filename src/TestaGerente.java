
public class TestaGerente {
	
	public static void main(String[] args) {
	
		Gerente daniel = new Gerente();
		
		daniel.setNome("Daniel Veronez");
		daniel.setCpf("777.777.777-77");
		daniel.setSalario(5000);
		daniel.setSenha(123456);
		
		System.out.println("Nome:      		  " + daniel.getNome());
		System.out.println("Salario: 	      R$" + daniel.getSalario());
		System.out.println("Senha Cadastrada: " + daniel.getSenha());
		
		System.out.println(daniel.autentica(123456));
		
		System.out.println(daniel.getBonificacao());
	}
}
