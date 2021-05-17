package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SelecaoArtigo implements OpcoesCommand{

    public SelecaoArtigo(){}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Database db = new Database(false);
		ArrayList<Artigo> artigosAceitos = (ArrayList<Artigo>) db.buscaTodosArtigosAceitos();

		String sigla = null;
		try {
			sigla = this.pedeInformacao();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (db.buscaConferenciaSigla(sigla)) {
			
		}
		else {
			
		}
		
		
		

		}
	
	public String pedeInformacao() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite a sigla da conferencia: ");
		String sigla = reader.readLine();

		return sigla;
	}

}