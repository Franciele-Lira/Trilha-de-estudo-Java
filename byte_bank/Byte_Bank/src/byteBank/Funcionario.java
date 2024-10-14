package byteBank;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String empresa;
	private String cargo;
	
	//Lembrar que colocar apenas atributos necessários que 
	//você vai utilizar.


	public Funcionario() { // construtor vázio
		
	}
	
	public double  getBonificacao() {
		return this.salario * 0.1; 	
		} //Calculando a bonificação do funcionario.
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
