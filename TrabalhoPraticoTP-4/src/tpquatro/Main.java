// Douglas Chaves Moura - 515141

package tpquatro;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setId(1);
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		System.out.println("Média: " + aluno1.retornaMedia());
		
		if (aluno1.passou() == true) {
			System.out.println("Pasou");
		} else {
			System.out.println("Não Passou");
		}
	///////////////////////////////////////////////////////////////
		
		Disciplina turmaCK0084 = new Disciplina();
		Aluno aluno2 = new Aluno();
		aluno2.setNome("João");
		aluno2.setId(2);
		aluno2.nota1 = 5;
		aluno2.nota2 = 10;
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Ana");
		aluno3.setId(3);
		aluno3.nota1 = 6;
		aluno3.nota2 = 8.5;
		
		turmaCK0084.adicionarAluno(aluno1, 0);
		turmaCK0084.adicionarAluno(aluno2, 1);
		turmaCK0084.adicionarAluno(aluno3, 2);
		
		turmaCK0084.mediaNota1();
		System.out.println("Média da Turma CK0084: " + turmaCK0084.mediaNota1());
		turmaCK0084.removeAluno(1);
		turmaCK0084.mediaNota2();
		System.out.println("Média da Turma CK0084: " + turmaCK0084.mediaNota2());
		turmaCK0084.adicionarAluno(aluno1, 1);
		
		turmaCK0084.imprimeAlunosPróximos(0);
		turmaCK0084.imprimeAlunosPróximos(1);
		turmaCK0084.imprimeAlunosPróximos(2);
		
		
	}

}
