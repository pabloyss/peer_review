package peer_review;

public class Artigo {
	private int id;
	private String titulo;
	private Pesquisador autor;
	private Conferencia conferencia;
	private TopicoPesquisa topico_relacionado;
	
	// Construtor
	public Artigo(int id, String titulo , Pesquisador autor, Conferencia conferencia, TopicoPesquisa topico_relacionado) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.conferencia = conferencia;
		this.topico_relacionado = topico_relacionado;
	}
	
	// Getters
	public int getId() {
		return this.id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public Pesquisador getAutor() {
		return this.autor;
	}
	
	public Conferencia getConferencia() {
		return this.conferencia;
	}
	
	public TopicoPesquisa getTopico_relacionado() {
		return this.topico_relacionado;
	}
	
	// Setters
	public void getId(int id) {
		this.id = id;
	}
	
	public void getTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void getAutor(Pesquisador autor) {
		this.autor = autor;
	}
	
	public void getConferencia(Conferencia conferencia) {
		this.conferencia = conferencia;
	}
	
	public void getTopico_relacionado(TopicoPesquisa topico_relacionado) {
		this.topico_relacionado = topico_relacionado;
	}

	public String toString() {
		return "ID: " + this.id + " | Titulo: " + this.titulo + " | Autor: " + this.autor + " | Conferencia: " + this.conferencia.getSigla() + " | Tópico Relacionado: " + this.topico_relacionado;
	}
}
