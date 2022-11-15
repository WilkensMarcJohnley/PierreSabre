package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int nbArgent, String clan) {
		super(nom, boisson, nbArgent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argent_extorquer;
		parler(victime.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		argent_extorquer=victime.seFaireExtorquer();
		nbArgent+=argent_extorquer;
		reputation+=1;
		parler("J’ai piqué les " + argent_extorquer + " sous de Marco, ce qui me fait " + nbArgent + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argent_perdu=nbArgent;
		nbArgent=0;
		reputation-=1;
		parler("J’ai perdu mon duel et mes " + argent_perdu + " sous, snif... J'ai déshonoré le clan de " + clan);
		return argent_perdu;
	}
	
	public void gagner(int gain) {
		nbArgent+=gain;
		reputation+=1;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + clan + " ? \n Je l'ai dépouillé de ses " + gain + " sous");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
}
