package avecFonctionnaliteSupp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;



public class ServeurTCP {
	static List<CompteBancaire> liste=new ArrayList<CompteBancaire>() ;
	public static void main(String[] args) throws IOException {
		liste=new ArrayList<CompteBancaire>();
		ServerSocket ss= new ServerSocket(6789);
		while(true) {
			Socket sc =ss.accept();
			Traitement t= new Traitement(sc,liste);
			t.start();
		}
	}
}
