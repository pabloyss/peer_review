package peer_review;

public class RevisaoNotas {
	private Artigo artigo;
    private Pesquisador revisor;
    private int nota;

    // Construtores
    
    public RevisaoNotas(Artigo artigo, Pesquisador revisor) {
        this.artigo = artigo;
        this.revisor = revisor
    }

    public RevisaoNotas(Artigo artigo, Pesquisador revisor, int nota) {
        this.artigo = artigo;
        this.revisor = revisor
        this.nota = nota;
    }
    
    // Getters

	public Artigo getArtigo() {
        return this.artigo
    }

    public Pesquisador getRevisor() {
        return this.revisor;
    }

    public int getNota() {
        return this.nota;
    }

    // Setters
    
    public void setArtigo(artigo){
        this.artigo = artigo;
    }

    public void setRevisor(Pesquisador revisor) {
        this.revisor = revisor;
    }
    
    public void setNota(nota){
        this.nota = nota;
    }
}
