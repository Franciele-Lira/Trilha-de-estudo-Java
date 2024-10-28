package Livro;

public class Livro {
	
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public static void main(String[] args) {
		Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96);
		
		System.out.println("O livro é: " + livro.getTitulo());
		System.out.println("O autor é: " + livro.getAutor());
		System.out.println("Número de páginas: " + livro.getNumeroPaginas());
	}
}

