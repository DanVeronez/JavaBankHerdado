//Não pode instanciar/criar objetos dessa classe, pois é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo, não há implementação, os filhos precisam implementar
	public abstract double getBonificacao();
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

}
