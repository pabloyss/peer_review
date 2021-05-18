package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SelecaoArtigo implements OpcoesCommand{

	private final Database database;
	
    public SelecaoArtigo(Database database){
    	this.database = database;
    }
	@Override
	public void execute() {
		ArrayList<Artigo> artigosAceitos = (ArrayList<Artigo>) database.buscaTodosArtigosAceitos();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sigla = null;
		try {
			sigla = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (database.buscaConferenciaSigla(sigla)) {
			
		}
		else {
			
		}
		
		
		

		}
}