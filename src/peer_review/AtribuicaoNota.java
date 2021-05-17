package peer_review;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AtribuicaoNota implements OpcoesCommand {

	// Construtor
	public AtribuicaoNota(){}
	
	@Override
	public void execute() {
		Database db = new Database(false);
		ArrayList<Artigo> artigos;
		ArrayList<Pesquisador> revisores;
		int nota;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		artigos = db.buscaTodosArtigos();

		for (Artigo artigo : artigos) {
			System.out.println(artigo);
		}

		System.out.println("\nEscolha o ID do artigo para ser avaliado");
		int id_artigo = Integer.parseInt(reader.readLine());

		revisores = db.buscaTodosPesquisadores();

		for (Pesquisador revisor : revisores) {
			System.out.println(revisor);
		}

		System.out.println("\nEscolha o ID do revisor que irá avaliar");
		int id_revisor = Integer.parseInt(reader.readLine());

		System.out.println("\nInsira uma nota de -3 a 3");
		int nota = Integer.parseInt(reader.readLine());

		Artigo artigo = artigos.get(id_artigo - 1);
		Pesquisador revisor = revisores.get(id_revisor - 1);

		ArrayList<RevisaoNotas> revisao_notas = db.pegaTodasNotas();

		RevisaoNotas novaNota = new RevisaoNotas(artigo, revisor, nota);

		revisao_notas.add(novaNota);

		db.salvaNotas(revisao_notas);
	}

	@Override
	public void pedeInformacao() {
		// TODO Auto-generated method stub
		
	}

}
