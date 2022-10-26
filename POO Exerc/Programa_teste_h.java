
public class Programa_teste_h {

	public static void main(String[] args) {
	
		Pessoa p1, p2, p3;
		
		p1 = new Pessoa("Pedro", 18, 'M', 1.7);
		System.out.println( p1.getNome() );
		System.out.println( p1.getIdade());
		
		p1.setIdade(129);
		//p1.idade = -20;
		System.out.println( p1.getNome() );
		System.out.println( p1.getIdade());
		
		Aluno a1, a2;
		a1 = new Aluno();
		a2 = new Aluno("Maria", 19, 'F', 1.6, 12345, "ADS");
		System.out.println( a2.getNome() );
		System.out.println( a2.getIdade());
		System.out.println( a2.getMatricula());
		System.out.println( a2.getCurso());
		a1.setNome("Carlos");
		System.out.println( a1.getNome() );
		System.out.println( a1.getIdade());
		System.out.println( a1.getMatricula());
		System.out.println( a1.getCurso());
		
	}

}
