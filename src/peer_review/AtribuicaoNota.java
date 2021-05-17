package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AtribuicaoNota implements OpcoesCommand {

	private final Database db;
	// Construtor
	public AtribuicaoNota(Database db) {
		this.db = db;
	}
	
	@Override
	public void execute() {
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
		do {
			try {
				id_artigo = Integer.parseInt(reader.readLine());
				if (id_artigo < 1 || id_artigo > artigos.size()) {
					System.out.println("ID inexistente, tente novamente");
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (id_artigo < 1 || id_artigo > artigos.size());

		revisores = db.buscaTodosPesquisadores();

		for (Pesquisador revisor : revisores) {
			System.out.println(revisor);
		}

		System.out.println("\nEscolha o ID do revisor que irá avaliar");
		int id_revisor = -1;
		do {
			try {
				id_revisor = Integer.parseInt(reader.readLine());
				if (id_revisor < 1 || id_revisor > revisores.size()) {
					System.out.println("ID inexistente, tente novamente");
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(id_revisor < 1 || id_revisor > revisores.size());
		
		System.out.println("\nInsira uma nota de -3 a 3");
		do {
			try {
				nota = Integer.parseInt(reader.readLine());
				if (nota < -3 || nota > 3) {
					System.out.println("Nota inválida, tente novamente");
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(nota < -3 || nota > 3);
		
		Artigo artigo = artigos.get(id_artigo - 1);
		Pesquisador revisor = revisores.get(id_revisor - 1);

		RevisaoNotas novaNota = new RevisaoNotas(artigo, revisor, nota);
		db.salvaNota(novaNota);
		
		System.out.println("\nNota "+ nota +" atribuída com sucesso com sucesso ao artigo "+ artigo.getTitulo() +" pelo revisor "+ revisor.getNome() +"!\n\n");
	}
}
