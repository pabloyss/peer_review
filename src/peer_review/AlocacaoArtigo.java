package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlocacaoArtigo implements OpcoesCommand {

	public AlocacaoArtigo(){}
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		Database db = new Database(true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nQual conferencia deve ser feita alocacao avaliado");
		try {
			String sigla = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nQuantos revisores devem ser alocados para cada artigo");
		try {
			Integer num_revisores = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Artigos> artigos = db.buscaArtigosConferencia(sigla);

		


	}
	

}
