
public class Pessoa {
	private String nome;
	public int idade;
	private char sexo;
	private double altura;
	
	public Pessoa (String n, int i, char s, double a) {
		nome = n;
		idade = i;
		sexo = s;
		altura = a;
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome ( String n) {
		nome = n;
	}
	public String getNome() {
		return nome;
	}	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if ((idade >=0) && (idade < 130) ) this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


}
