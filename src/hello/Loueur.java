/**
 * 
 */
package hello;

import hello.Parametre;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur {
public int nbLivresLoueur;
public double cotisation;
	/**
	 * 
	 */
	public Loueur() {
		// TODO Auto-generated constructor stub
	
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		
	// super invoque et initialise la classe parente (fonctionne avec un constructeur)	
	super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setNbLivres(int nbLivresLoueur) {
		this.nbLivresLoueur = nbLivresLoueur;
		// Parametre params = new Parametre();
		
		if (nbLivresLoueur >= Parametre.nbLivres) {
		   this.cotisation =  Parametre.remise * Parametre.cotisation ; 
		}
		else {this.cotisation = Parametre.cotisation;}
		   	   
	}
	

}
