package byteBank;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marocas");
		g1.setCpf("254545645-8");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(5554);
		
		boolean autenticou  = g1.autentica(5554);
		System.out.println(autenticou);

	}

}
