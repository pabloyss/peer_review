package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UsuarioUI {
	private Map<String, OpcoesCommand> mapa;
	private final Database database;
	
	public UsuarioUI() {
		database = new Database();
		this.mapa = new HashMap<String, OpcoesCommand>();
		mapa.put("1", new SelecaoArtigo(database));
		mapa.put("2", new AlocacaoArtigo());
		mapa.put("3", new AtribuicaoNota(database));
	}

	public void getComando() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String option;
		boolean sair = false;
		do {
			menu();
			option = reader.readLine();
			switch (option) {
			case "0":
				sair = true;
				break;
			case "1":
			case "2":
			case "3":
				OpcoesCommand opcoesCommand = mapa.get(option);
				opcoesCommand.execute();
				break;
			default:
				System.out.print("Opção inválida, tente novamente\n\n");	
			}
		} while(!sair); 
		System.out.print("Encerrando o programa...");
	}
	
	public void menu() {
		System.out.println("Peer Review");
		System.out.println("Escolha uma opção:");
		System.out.println("0 - Sair");
		System.out.println("1 - Seleção de Artigos");
		System.out.println("2 - Alocação de Artigos a Membros do Comitê de Programas");
		System.out.println("3 - Atribuição de Notas a Artigos");
	}
}
