package Exercicios;

public class ContadorBreak {
public static void main(String[] args) {
	for(int numero =1; numero <= 100; numero++) {
		
		if(numero == 52) 
			break;
		System.out.println("a contagem esta no: " + numero);
	}
}
}
