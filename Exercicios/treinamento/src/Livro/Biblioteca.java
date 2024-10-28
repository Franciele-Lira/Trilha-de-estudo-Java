package Livro;

import java.util.Scanner;

public class Biblioteca {
public static void main(String[] args) {
	
	Scanner user = new Scanner(System.in);
	System.out.println("Digite o Livro que você está procurando: ");
	
	String livro = user.nextLine();
	
	System.out.println("Ah ok, você está procurando: " + livro );
	
	System.out.println("Legal, eu encontrei ele aqui na minha lista.");
	
	System.out.println("Digite agora o seu nome e CPF para retirada do livro");
	System.out.println("Digite seu nome :");
	
	String nome = user.nextLine();
	
	System.out.println("Beleza, " + nome + " . ");
	
	System.out.println("Digite agora seu cpf: ");
	int CPF = user.nextInt();
	
	System.out.println("Beleza,seu nome é: " + nome + " E você está registrada no CPF: " + CPF);
	System.out.println("Pode por favor se dirigir ao balcão para retirada.");
	System.out.println("Obrigada pela preferencia, espero ter te ajudado. ");
	
	
	 
}
}
