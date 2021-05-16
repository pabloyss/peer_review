package peer_review;

public class Pesquisador {
	private int id;
	private String nome;
	private Universidade afiliacao;
	private TopicoPesquisa[] topicos_pesquisa;
	
	// Construtor
	public Pesquisador(int id, String nome, Universidade afiliacao, TopicoPesquisa[] topicos_pesquisa) {
		this.id = id;
		this.nome = nome;
		this.afiliacao = afiliacao;
		this.topicos_pesquisa = topicos_pesquisa;
	}
	
	// Getters
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Universidade getAfiliacao() {
		return this.afiliacao;
	}
	
 	public TopicoPesquisa[] getTopicosPesquisa() {
 		return this.topicos_pesquisa;
 	}
 	
 	// Setters
 	public void setId(int id) {
 		this.id = id;
 	}
 	
 	public void setNome(String nome) {
 		this.nome = nome;
 	}
 	
 	public void setAfiliacao(Universidade afiliacao) {
 		this.afiliacao = afiliacao;
 	}
 	
 	public void setTopicosPesquisa(TopicoPesquisa[] topicos_pesquisa) {
 		this.topicos_pesquisa = topicos_pesquisa;
 	}
}
