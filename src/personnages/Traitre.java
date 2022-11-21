package personnages;



public class Traitre extends Samourai {
	private int niveauTraitre=0;

	public Traitre(String seigneur, String nom, String boisson, int nbArgent) {
		super(seigneur, nom, boisson, nbArgent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitre + " Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitre<3) {
			int argentCommercant=commercant.getNbArgent();
			int argentRanconner= argentCommercant/5;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !\n Donne-moi " + argentRanconner + " sous gare a toi!");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			niveauTraitre++;
			
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer !");
			
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler ("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			int don=nbArgent/20;
			int posAmi= (int)(Math.random()*(nbConnaissance-0));
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + memoire[posAmi].getNom()+ ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			perdreArgent(don);
			memoire[posAmi].gagnerArgent(don);
			memoire[posAmi].parler("Merci " + getNom()+ " vous etes quelqu'un de bien");
			
			if (niveauTraitre>1) {
				niveauTraitre--;
			}
		}
	}
}
