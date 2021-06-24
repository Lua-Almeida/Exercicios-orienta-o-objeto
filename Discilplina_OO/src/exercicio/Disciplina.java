package exercicio;

public class Disciplina {

	private String nome,professor;
	private int semestre;
	private boolean ofertada;
	
	
	public Disciplina(String nome, String professor, int semestre, boolean ofertada) {
		this.nome = nome;
		this.professor = professor;
		this.semestre = semestre;
		this.ofertada = ofertada;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public boolean isOfertada() {
		return ofertada;
	}
	public void setOfertada(boolean ofertada) {
		this.ofertada = ofertada;
	}

	@Override
	public String toString() {
		return "Disciplina:\nnome= " + nome + "\nprofessor= " + professor + "\nsemestre=" + semestre + "\nofertada= "
				+ ofertada ;
	}
	
	
	
	
	
}
