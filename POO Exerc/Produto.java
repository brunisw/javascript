public class Produto {
	private int codigo;
	private String nome;
	
	public Produto(int cod, String nome_prod) {
		codigo = cod;
		nome = nome_prod;
	}
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome_produto) {
		nome = nome_produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo( int novo_codigo) {
		codigo = novo_codigo;
	}
}
