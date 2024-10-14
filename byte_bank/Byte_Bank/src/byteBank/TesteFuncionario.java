package byteBank;

public class TesteFuncionario {
public static void main(String[] args) {
		
		//Funcionario nico = new Funcionario();
		//nico.setNome("Nico Steppat");
		//nico.setCpf("22645545645-9");
		//nico.setSalario(2600.00);
		
		//System.out.println(nico.getNome());
		//System.out.println(nico.getBonificacao());
		
		Funcionario lira = new Funcionario();
		lira.setNome("Franciele Lira");
		lira.setCpf("12456987-5");
		lira.setSalario(2000.00);
		lira.setEmpresa("Tecban");
		lira.setCargo("Programador");
		
		System.out.println("Nome:" + lira.getNome());
		System.out.println("Salario:" + lira.getSalario());
		System.out.println("Bonificação do mês foi:" + lira.getBonificacao());
		System.out.println("Numero do CPF:" + lira.getCpf());
		System.out.println("Empresa: " + lira.getEmpresa());
		System.out.println("Cargo: " + lira.getCargo());
	
	}
}
