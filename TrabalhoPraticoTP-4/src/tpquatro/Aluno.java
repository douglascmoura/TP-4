package tpquatro;

public class Aluno {
	
	private String nome;
	private int id;
	private double media;
	
	protected double nota1;
	protected double nota2;
	
	
	public void imprimeNome() {
		System.out.println("Nome:" + this.getNome());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimeId() {
		System.out.println("Id: " + this.getId());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	private void calculaMedia() {
		media = (nota1 + nota2)/2;
	}
	
	public double retornaMedia() {
		calculaMedia();
		return media;
	}
	
	public boolean passou() {
		if (media > 7) {
			return true;
		} else {
			return false;
		}
		

		
	}

}
