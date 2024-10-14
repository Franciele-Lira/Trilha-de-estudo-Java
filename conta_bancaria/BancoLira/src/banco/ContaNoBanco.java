package banco;

 public class ContaNoBanco {
	public String nome;
	public String sobrenome;
	public String cpf;
	public double saldo;

	public ContaNoBanco(String nome, String sobrenome, String cpf) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}
	
	public void consultaSaldo (){
		System.out.println("Saldo: R$" + saldo);
	}
	
	public void fazerDeposito(double valor) {
		saldo += valor; // Aumentar o saldo quando houver um deposito.
		System.out.println(" Deposito de R$: " + valor + "Efetuado com suceso.");
	}
	public void Sacar (double valor) {
		if(valor <= saldo) {
			saldo -= valor; // Diminuir o saldo quando houver algum saque.
			System.out.println("Saque de R$ " + valor + "Efetiado com sucesso.");
			
		}else {
		
		System.out.println("Saldo insuficiente para saque");
		}
		}
	}
 
