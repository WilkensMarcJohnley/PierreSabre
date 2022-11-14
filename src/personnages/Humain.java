package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int nbArgent;
	
	public Humain(String nom, String boisson, int nbArgent) {
		this.nom = nom;
		this.boisson = boisson;
		this.nbArgent = nbArgent;
	}

	public String getNom() {
		return nom;
	}

	public int getNbArgent() {
		return nbArgent;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte + ".");
	}
	
	public String prendreParole() {
		return "(" + nom +")- ";
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix<=nbArgent) {
			parler("J'ai " + nbArgent + " sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + nbArgent + " sous en poche. Je ne peux même pas m'offrir un kimono à" + prix + " sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		nbArgent+=gain;
	}
	
	public void perdreArgent(int perte) {
		nbArgent-=perte;
	}
	
}
