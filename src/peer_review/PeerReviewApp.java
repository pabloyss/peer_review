package peer_review;

import java.io.IOException;

public class PeerReviewApp {

	public static void main(String[] args) {
		try {
			new UsuarioUI().getComando();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
