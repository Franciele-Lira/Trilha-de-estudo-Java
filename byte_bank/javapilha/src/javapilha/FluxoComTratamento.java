package javapilha;

public class FluxoComTratamento {

	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
	        } catch(ArithmeticException |NullPointerException | MinhaExcecao ex) {
	        	String msg = ex.getMessage();
	        	System.out.println("Excepetion " + msg);
	        	ex.printStackTrace();
	        }
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        
        throw new MinhaExcecao("Crachou o joguin");
	        //ArithmeticException exception = new ArithmeticException();
	       // throw exception;
	        
	        //System.out.println("Fim do metodo2");     
}
	
}
