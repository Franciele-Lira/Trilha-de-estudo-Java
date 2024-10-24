package byteBank;

public class Conta {
	 double saldo;
	    int agencia;
	    int numero;
	    String titular;
	    
	    void deposita(double valor) {
	    	this.saldo = this.saldo + valor;
	    }
	    
	    public boolean saca(double valor) {
	    	if(this.saldo >= valor) {
	    		this.saldo -= this.saldo - valor; /// -= TIRE VALOR DELE MESMO
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	    
	    public boolean transfere(double valor, Conta destino) {
	    	if(this.saldo >= valor) {
	    		this.saldo -= valor;
	    		destino.deposita(valor);
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
}
