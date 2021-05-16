package peer_review;

public class Universidade {
	private String nome;
	private String sigla;
	
	// Construtor
	public Universidade(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getSigla() {
		return this.sigla;
	}
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
