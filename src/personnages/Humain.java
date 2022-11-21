package personnages;


public class Humain {
	private String nom;
	private String boisson;
	protected int nbArgent;
	private int taille_memoire=30;
	protected Humain[] memoire= new Humain[taille_memoire];
	protected int nbConnaissance=0;
	
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
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
	}
	
	private void repondre(Humain homme) {
		direBonjour();
		memoriser(homme);
		homme.memoriser(this);
	}
	
	private void memoriser(Humain homme) {
		if (nbConnaissance>=taille_memoire) {
			for (int i = 0; i < taille_memoire-1; i++) {
				memoire[i]=memoire[i+1];
			}
			
			memoire[taille_memoire-1]=homme;
			
		} else {
			memoire[nbConnaissance]= homme;
			nbConnaissance+=1;
		}
	}
	
	public void listerConnaissance() {
		String nom="";
		for (int i = 0; i < (nbConnaissance-1); i++) {
			nom+=" " + memoire[i].getNom() + ",";
		}
		
		nom+=" " + memoire[nbConnaissance-1].getNom();
		
		parler("Je connais beaucoup de monde dont :" + nom);
	}
	
	
}
