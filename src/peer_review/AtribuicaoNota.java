package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AtribuicaoNota implements OpcoesCommand {

	// Construtor
	public AtribuicaoNota(){}
	
	@Override
	public void execute() {
		Database db = new Database(true);
		List<Artigo> artigos;
		List<Pesquisador> revisores;
		int nota = -4;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		artigos = db.buscaTodosArtigos();

		for (Artigo artigo : artigos) {
			System.out.println(artigo);
		}

		System.out.println("\nEscolha o ID do artigo para ser avaliado");
		int id_artigo = -1;
		try {
			id_artigo = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		revisores = db.buscaTodosPesquisadores();

		for (Pesquisador revisor : revisores) {
			System.out.println(revisor);
		}

		System.out.println("\nEscolha o ID do revisor que irá avaliar");
		int id_revisor = -1;
		try {
			id_revisor = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nInsira uma nota de -3 a 3");
		try {
			nota = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Artigo artigo = artigos.get(id_artigo - 1);
		Pesquisador revisor = revisores.get(id_revisor - 1);

		RevisaoNotas novaNota = new RevisaoNotas(artigo, revisor, nota);

		db.salvaNota(novaNota);
	}
}
