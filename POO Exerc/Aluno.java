
public class Aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	public Aluno() {
		
	}
	
	public Aluno (String n, int i, char s, double a ,
				   int m, String c	) {
		super(n,i,s,a);
		matricula = m;
		curso = c;		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}
