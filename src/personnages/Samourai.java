package personnages;

public class Samourai extends Ronin {
	String seigneur;

	public Samourai(String seigneur, String boisson,String nom , int nbArgent) {
		super(nom, boisson, nbArgent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);

	}
	
	
}
