package Exercicios;

public class ExercicioContinue {

	public static void main(String[] args) {
		for( int numero = 1; numero <= 100; numero++) {
			if(numero==52)
				continue;
			
			System.out.println("O contador é: " + numero);
		}

	}

}
