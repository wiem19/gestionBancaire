package avecFonctionnaliteSupp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Traitement extends Thread{
	private Socket sc ;
	static List<CompteBancaire> liste=new ArrayList<CompteBancaire>() ;
	static List<Operation> listeOPS=new ArrayList<Operation>() ;
	String messageClient,msg="";
	public Traitement(Socket sc,List<CompteBancaire> liste) {
		super();
		this.sc = sc;
		this.liste=liste ;
	}
	public void run() {
		try {
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(sc.getInputStream()));
			PrintWriter outToClient=new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())),true);
			CompteBancaire c =new CompteBancaire();
			java.util.Date date=new java.util.Date();
			Operation o=new Operation(date);
			while(true) {
				messageClient=inFromClient.readLine();
				
				String[] cmd=messageClient.split(" ");
				
				if(cmd[0].equalsIgnoreCase("CREATION")) {
					
					c.setNomPropriétaire(cmd[1]);
					liste.add(c);
					msg="welcome "+c.getNomPropriétaire()+", your account is created successfuully !";
					o.setNomPersonne(c.getNomPropriétaire());
					o.setType("création");
				}
				else if(cmd[0].equalsIgnoreCase("CREDIT")) {
					float credit=Float.parseFloat(cmd[1]) ;
					float nouveauSolde = c.getSolde()+credit;
					c.setSolde(nouveauSolde);
					o.setType("crédit");
					o.setMontant(credit);
					msg="solde mis a jour avec success";
					
				}
				else if(cmd[0].equalsIgnoreCase("DEBIT")) {
					
					float debit=Float.parseFloat(cmd[1]) ;
					float nouveauSolde = c.getSolde()-debit;
					
					if(nouveauSolde > 0) {
						c.setSolde(nouveauSolde);
						msg="solde mis a jour avec success";
						o.setType("crédit");
						o.setMontant(debit);
						}
						else
							msg="solde insffusant";
				}
				else if(cmd[0].equalsIgnoreCase("SOLDE")) {
					o.setType("solde");
					o.setMontant(c.getSolde());
					msg="**"+c.getSolde()+"**";
				}
				else {
					msg="erreur, réessayer svp ";
				}
				
				listeOPS.add(o);
				outToClient.println(msg);
				for(int i=0; i< listeOPS.size();i++) {
					System.out.println(listeOPS.get(i).toString());
				}
				
			}
			
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	

}
