/**
 * 
 */
package hello.livres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livres.exceptions.DateNaissanceException;

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
	public static Auteurs getAuteurs(String nom, String prenom, Date naissance) throws DateNaissanceException {
		Date today = new Date();
		if (naissance.after(today)) {
			throw new DateNaissanceException();
		}
		
		Auteurs auteur = new Auteurs(nom, prenom, naissance);
		return auteur;
			
		}
	
	// ParseExeption envoie une exeption
	public static Auteurs getAuteur() throws ParseException, DateNaissanceException {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Nom de l'auteur : ");
		String nom = scanner.nextLine();
		scanner.nextLine();
		
		
		System.out.println("Prenom de l'auteur : ");
		String prenom = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String naissance = scanner.nextLine();
		
		// Convertir la chaîne en date
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = format.parse(naissance); 
        
        scanner.nextLine();
		
		
		// On peut instancier un nouvel auteur à partir des informations
		return getAuteurs(nom, prenom, date);
	}
	
	
	public String getNom() {
		return nom;
	}
	public Auteurs setNom(String nom) {
		this.nom = nom;
		return this; //optionnel, juste pour récupérer un chaînage
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
