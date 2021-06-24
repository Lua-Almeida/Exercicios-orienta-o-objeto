package exercicio;

public class Turma {

	private String nome, curso;
	private int quantidadeDeAlunos,serie;
	
	
	
	public Turma(String nome, String curso, int quantidadeDeAlunos, int serie) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.serie = serie;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "\nTurma: \nnome= " + nome + "\ncurso= " + curso + "\nquantidadeDeAlunos= " + quantidadeDeAlunos + "\nserie="
				+ serie ;
	}
	
	
	
	
}
