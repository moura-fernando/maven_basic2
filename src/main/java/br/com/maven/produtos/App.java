package br.com.maven.produtos;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Produto produto = new Produto("Bala juquinha", 0.15);
		
		System.out.println("O produto "+ produto.getNome() + " custa: " + produto.getPreco());

	}
}
