package desafio;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		//Definindo o valor e o tipo do saldo.
		double saldo;
		saldo = 237.48;
		
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Por favor, digite o seu Nome: ");
        String nome = scanner.nextLine();
        
		System.out.println("Por favor, digite o número da Agência!");
		String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();


      
        

        
        
     // Exibindo os dados do usuario
        System.out.println("\nSeus dados são:");
        System.out.println("Agência: " + agencia);
        System.out.println("numero: " + numero);
        System.out.println("Nome: " + nome);

         System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco,sua agência é: "+ agencia +", conta:" + numero +  " e seu saldo atual é:" + saldo + ",já está disponível para saque!\nObrigada!"); 
            
       
        
        scanner.close();

		
	}
}
