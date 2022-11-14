package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		/*
		 * Humain homme; homme= new Humain("Prof","kombucha",54); homme.direBonjour();
		 * homme.acheter("une boisson", 12); homme.boire(); homme.acheter("jeu", 2);
		 * homme.acheter("kimono", 50);
		 */
		
		Commercant commercant= new Commercant("Marco","the",15);
		
		 commercant.direBonjour(); 
		 commercant.seFaireExtorquer();
		  commercant.recevoir(15); 
		  commercant.boire();
		 
		Yakuza yakuza= new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		
		  yakuza.direBonjour(); 
		  yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"); 
		 yakuza.extorquer(commercant);
		 
		
		Ronin ronin= new Ronin("Roro","shochu",60);
		 ronin.direBonjour(); ronin.donner(commercant);
		 
		
		ronin.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		ronin.provoquer(yakuza);
	}
}
