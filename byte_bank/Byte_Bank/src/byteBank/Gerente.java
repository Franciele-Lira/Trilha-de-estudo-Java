package byteBank;

public class Gerente extends Funcionario {
private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	//Lembrar que colocar apenas atributos necessários que 
	//você vai utilizar.


	public Gerente() { // construtor vázio
		
	}
	
	//public double  getBonificacao() {
		//return this.salario;	
		//} //Calculando a bonificação do funcionario.
	
}
