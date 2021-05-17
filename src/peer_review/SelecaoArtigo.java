package peer_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelecaoArtigo implements OpcoesCommand{

    public SelecaoArtigo(){}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Conferencia selectedConferencia = this.pedeInformacao();
		}
	
	public void pedeInformacao() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite a sigla da conferencia: ");
		String option = reader.readLine();
	}

}
