package avecFonctionnaliteSupp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
	public static void main (String[] args) throws UnknownHostException, IOException {
		String hostname="127.0.0.1";
		String message="",messgaModifier="" ;
		int port=6789;
		Socket client= new Socket(hostname,port);
		while(true) {
			
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			PrintWriter outToServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())),true);
			
			String msg=inFromUser.readLine();
			
			outToServer.println(msg);
			
			messgaModifier=inFromServer.readLine();
			
			System.out.println("server: "+messgaModifier);
		}
		//client.close();
		
		
	}

}
