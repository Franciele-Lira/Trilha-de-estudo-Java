package excecoes;

public class TratandoExcecao {
	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;
            int resultado = a / b;  // Isso vai gerar uma exceção (divisão por zero)
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            System.out.println("Bloco finally sempre será executado.");
        }
	}
}
