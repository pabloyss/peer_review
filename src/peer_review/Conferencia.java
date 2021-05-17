package peer_review;

import java.util.List;

public class Conferencia {
	private String sigla;
	private Pesquisador[] membros_comite;
	
	// Construtor
	public Conferencia(String sigla, Pesquisador[] membros_comite) {
		this.sigla = sigla;
		this.membros_comite = membros_comite;
	}
	
	// Getters
	public String getSigla() {
		return this.sigla;
	}
	
	
	public Pesquisador[] getMembrosComite() {
		return this.membros_comite;
	}
	
	// Setters
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	
	public void setMembrosComite(Pesquisador[] membros_comite) {
		this.membros_comite = membros_comite;
	}
}
