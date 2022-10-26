public class Programa_teste {

	public static void main(String[] args) {
		int a = 78;
		double x = 2.5;
		int[] b;

		b = new int[10]; 

		Produto p1, p2;
		p1 = new Produto(123, "Impressora");
		System.out.println("Codigo: " + p1.getCodigo());
		System.out.println("Nome  : " + p1.getNome());

		// alterar os valores dos atributos
		p1.setCodigo(210);
		p1.setNome("Monitor");
		System.out.println("-- Valores alterados --");
		System.out.println("Codigo: " + p1.getCodigo());
		System.out.println("Nome  : " + p1.getNome());
		
		p2 = new Produto();
		p2.setNome("Hard disk");
		System.out.println("Codigo: " + p2.getCodigo());
		System.out.println("Nome  : " + p2.getNome());

		p1 = null;
	
	}

}
