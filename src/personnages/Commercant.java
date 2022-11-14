package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom,String boisson, int nbArgent) {
		super(nom,"the",nbArgent);
	}
	
	
	public int seFaireExtorquer() {
		int argent;
		argent=nbArgent;
		nbArgent=0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		nbArgent+=argent;
		parler(argent + " sous ! Je te remercie généreux donateur!");
	} 
	
	public static void main(String[] args) {
		Commercant commercant;
		commercant= new Commercant("john","biere",10);
		commercant.direBonjour();
	}
}
