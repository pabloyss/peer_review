package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UsuarioUI {
	Map<String, OpcoesCommand> mapa;
	
	public UsuarioUI() {
		this.mapa = new HashMap<String, OpcoesCommand>();
		mapa.put("1", new SelecaoArtigo());
		mapa.put("2", new AlocacaoArtigo());
		mapa.put("3", new AtribuicaoNota());
	}

	public void getComando() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String option;
		do {
			System.out.print("Digite uma opcao: ");
			option = reader.readLine();
			OpcoesCommand opcoesCommand = mapa.get(option);
			opcoesCommand.execute();
		} while (option != ""); 
	}
}
