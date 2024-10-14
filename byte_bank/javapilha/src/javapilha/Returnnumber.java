package javapilha;

public class Returnnumber {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 5;
		
		if(num1 == num2) {
			System.out.println("Os numeros são iguais!");
			System.out.println("Os dois juntos somam: ");
			System.out.println(num1 + num2);
			return;
			
		} else if (num1 <= num2) {
			System.out.println("O numero 1 é menor que o 2");
		} else {
			System.out.println("O numero 1 é maior que o 2");
		}
		
		System.out.println("O num1 + o num2, retorna: ");
		System.out.println(num1 + num2);
		
		
	}
}
