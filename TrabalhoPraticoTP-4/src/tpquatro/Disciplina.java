package tpquatro;

public class Disciplina {
	Aluno alunos[] = new Aluno[10];
	
	public void adicionarAluno(Aluno aluno, int pos) {
		aluno = alunos[pos];  
	}
	
	public void removeAluno(int idAluno) {
		for (int i = 0; i < 10; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getId() == idAluno) {
					alunos[i] = null;
				}
			}
		}
	}
	
	
	public double mediaNota1() {
		double somanotas1 = 0;
		int qtdAlunos = 0;
		for (int i=0; i<10; i++) {
			if (alunos[i] != null) {
				somanotas1 =+ alunos[i].getNota1();
			}
		}	
		return (somanotas1)/qtdAlunos;
	}
	
	public double mediaNota2() {
		double somanotas2 = 0;
		int qtdAlunos = 0;
		for (int i=0; i<10; i++) {
			if (alunos[i] != null) {
				qtdAlunos++;
				somanotas2 =+ alunos[i].getNota2();
			}
		} 
		return (somanotas2)/qtdAlunos;
	}

	public void imprimeAlunosPróximos(int id) {
		if (id == 0) {
			System.out.println("Não tem antecessor.");  
		} else if (id>=0 && id <10) {
			System.out.println("O antecessor é " + alunos[id-1].getNome());
			if ( id == 9) {
				System.out.println("Não tem sucessor.");
			}
	}	
}
	
}
