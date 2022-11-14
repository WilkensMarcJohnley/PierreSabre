package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	private int force=2*honneur;

	public Ronin(String nom, String boisson, int nbArgent) {
		super(nom, boisson, nbArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent;
		argent= nbArgent/10;
		nbArgent-=argent;
		parler(beneficiaire.getNom()+ " prend ces " + argent + " sous.");
		beneficiaire.recevoir(argent);
		
	}
	
	public void provoquer(Yakuza adversaire) {
		int argent;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa");
			argent=adversaire.perdre();
			nbArgent+=argent;
			honneur++;
		}
		
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(nbArgent);
			
		}
	}
	
}
