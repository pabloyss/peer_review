package peer_review;

import java.util.List;

public class Conferencia {
	private String sigla;
	private Pesquisador[] membros_comite;
	private Artigo[] lista_artigos;
	private String status;
	
	// Construtor
	public Conferencia(String sigla, Pesquisador[] membros_comite) {
		this.sigla = sigla;
		this.membros_comite = membros_comite;
		this.status = "NÃO ALOCADA";
	}

	public Conferencia(String sigla, Pesquisador[] membros_comite, Artigo[] lista_artigos) {
		this.sigla = sigla;
		this.membros_comite = membros_comite;
		this.lista_artigos = lista_artigos;
		this.status = "ALOCADA";
	}
	
	// Getters
	public String getSigla() {
		return this.sigla;
	}
	
	
	public Pesquisador[] getMembrosComite() {
		return this.membros_comite;
	}

	public Artigo[] getLista_artigos(){
		return this.lista_artigos;
	}
	
	public String getStatus() {
		return this.status;
	}

	
	// Setters
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
	public void setMembrosComite(Pesquisador[] membros_comite) {
		this.membros_comite = membros_comite;
	}

	public void setLista_artigos(Artigo[] lista_artigos){
		this.lista_artigos = lista_artigos;
	}
	
	public void adicionaArtigo(Artigo[] artigos) {
		this.lista_artigos = artigos;
		this.status = "ALOCADA";
	}
}
