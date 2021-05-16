package peer_review;

import java.util.List;

public class Conferencia {
	private String sigla;
	private List<Artigo> artigos_submetidos;
	private List<Pesquisador> membros_comite;
	
	// Construtor
	public Conferencia(String sigla, List<Artigo> artigos_submetidos, List<Pesquisador> membros_comite) {
		this.sigla = sigla;
		this.artigos_submetidos = artigos_submetidos;
		this.membros_comite = membros_comite;
	}
	
	// Getters
	public String getSigla() {
		return this.sigla;
	}
	
	public List<Artigo> getArtigosSubmetidos() {
		return this.artigos_submetidos;
	}
	
	public List<Pesquisador> getMembrosComite() {
		return this.membros_comite;
	}
	
	// Setters
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public void setArtigosSubmetidos(List<Artigo> artigos_submetidos) {
		this.artigos_submetidos = artigos_submetidos;
	}
	
	public void setMembrosComite(List<Pesquisador> membros_comite) {
		this.membros_comite = membros_comite;
	}
}
