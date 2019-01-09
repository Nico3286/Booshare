/**
 * 
 */
package hello.livres;

import java.util.Date;

/**
 * @author Dell
 *
 */
public class Auteurs {
	private String nom;
	private String prenom;
	private Date naissance;
	
	private Auteurs(String nom, String prenom, Date naissance) {
		 this.nom = nom;
    	 this.prenom = prenom;
    	 this.naissance = naissance;
	}
	
	// Méthode static qui est ici une fonction
	// Création d'un pattern Design static classFactory static
	public static Auteurs getAuteurs(String nom, String prenom, Date naissance) {
		Date today = new Date();
		if (naissance.after(today)) {
			return null;
		}
		
		Auteurs auteur = new Auteurs(nom, prenom, naissance);
		return auteur;
			
		}
	
	
	public String getNom() {
		return nom;
	}
	public Auteurs setNom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public Auteurs setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	
	public Date getNaissance() {
		return naissance;
	}
	public Auteurs setNaissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}
	
	
	
	

}
