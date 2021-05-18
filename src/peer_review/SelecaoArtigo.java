package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SelecaoArtigo implements OpcoesCommand{

	private final Database database;
	
    public SelecaoArtigo(Database database){
    	this.database = database;
    }
	@Override
	public void execute() {
		List<Artigo> artigosAceitos;
		List<Artigo> artigosRejeitados;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sigla = null;
		Boolean aviso = false;
		Double media = 0.0;
		
		System.out.println("Insira a sigla da conferência:");
		do {
			try {
				sigla = reader.readLine();
				
				if (!database.existeConferencia(sigla)) {
					System.out.println("Sigla inexistente, tente novamente");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while(!database.existeConferencia(sigla));
		
		Conferencia conferencia = database.pegaConferencia(sigla);
		
		if (conferencia.getStatus().equals("NÃO ALOCADA")) {
			System.out.println("--->  AVISO: A conferência ainda não foi alocada!  <---\n");
			aviso = true;
		}
		for (Artigo artigo : conferencia.getLista_artigos()) {
			if (!database.artigoTemNota(artigo)) {
				System.out.println("--->  AVISO: A conferência possuí artigos com notas não recebidas!  <---\n");
				aviso = true;
			}
		}
		
		if (!aviso) {
			for (Artigo artigo : conferencia.getLista_artigos()) {
				media = database.pegaMediaNota(artigo);
			}
		}
	}
}