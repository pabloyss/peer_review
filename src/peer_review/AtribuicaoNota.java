package peer_review;

public class AtribuicaoNota implements OpcoesCommand {

	// Construtor
	public AtribuicaoNota(){}
	
	@Override
	public void execute() {
		Database db = new Database(false);
		Collection<Artigo> artigos;
		Collection<Pesquisador> revisores;
		int nota;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		artigos = db.pegaTodosArtigos();

		for (Artigo artigo : artigos) {
			System.out.println(artigo);
		}

		System.out.prinlnt("\nEscolha o ID do artigo para ser avaliado")
		int artigo_escolhido = Integer.parseInt(reader.readLine());

		revisores = db.pegaTodosPesquisadores();

		for (Pesquisador revisor : revisores) {
			System.out.println(revisor);
		}

		System.out.prinlnt("\nEscolha o ID do revisor que irá avaliar")
		int artigo_revisor = Integer.parseInt(reader.readLine());

		System.out.prinlnt("\Insira uma nota de -3 a 3")
		int nota = Integer.parseInt(reader.readLine());

		Artigo artigo = artigos.get(artigo_escolhido - 1);

		
	}

	@Override
	public void pedeInformacao() {
		// TODO Auto-generated method stub
		
	}

}
