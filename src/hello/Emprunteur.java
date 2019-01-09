/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */

public class Emprunteur extends Utilisateur {
public int nbLivresEmprunteur;
public int nbJours;
public double cout;
	/**
	 * 
	 */
	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	
	public void setNbLivres(int nbLivresEmprunteur) {
		this.nbLivresEmprunteur = nbLivresEmprunteur;
		this.cout = 0.05*nbLivresEmprunteur;}
		
	
	public void setJours(int nbJours) {
		this.nbJours = nbJours;
		this.cout = cout*nbJours;	
		
		// Parametre params = new Parametre();
		
		//if (nbLivresLoueur >= Parametre.nbLivres) {
		 //  this.cotisation =  Parametre.remise * Parametre.cotisation ; 
		//}
		//else {this.cotisation = Parametre.cotisation;}
		   	   
	}

}
