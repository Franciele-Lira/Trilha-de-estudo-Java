package excecoes;

public class HierarquiaExcecoes {

	private static String texto;

	public static void main(String[] args) {
		 try {
	            texto = null;
	            System.out.println(texto.length());  // Isso vai gerar uma NullPointerException
	        } catch (NullPointerException e) {
	            System.out.println("Erro: O objeto é nulo.");
	        } catch (RuntimeException e) {
	            System.out.println("Erro: Ocorreu uma exceção de tempo de execução.");
	        } catch (Exception e) {
	            System.out.println("Erro: Ocorreu uma exceção geral.");
	        }
	 

	}

}
