/**
 * 
 */
package hello.utlilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livres.Auteurs;
import hello.livres.Livre;
import hello.livres.exceptions.DateNaissanceException;
import hello.tools.AuteurImport;

/**
 * @author Dell
 *
 */
public class CreateUser {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws DateNaissanceException 
	 */
	public static void main(String[] args) throws ParseException, DateNaissanceException {
		// TODO Auto-generated method stub
		Utilisateur loueur = CreateUser.createLoueur();
		Utilisateur emprunteur = CreateUser.createEmprunteur();
		Utilisateur emprunteurLoueur = createEmprunteurLoueur();
	   
		
		
// instanceof détermine sur un objet de quel type il est (loueur ou emprunteur ou loueurEmprunteur)
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom() + " est un loueur");
		}
		
		if (emprunteur instanceof Loueur ) {
			System.out.println(emprunteur.nom() + " est un loueur");
		} else {
			System.out.println(emprunteur.nom() + " n'est pas un loueur");
		}
		
		if (emprunteurLoueur instanceof EmprunteurLoueur ) {
			System.out.println(emprunteurLoueur.nom() + " est un loueur ou un emprunteur");
		
		}
		
		
		// Créer des livres
		
		Livre livre = new Livre("Les Misérables", "Bla bla bla", 1);
		
		((Loueur) loueur).addBook(livre);
		((Loueur) loueur).addBook(livre);
		
		Livre livre2 = new  Livre("Fondation", "Bli bli bli", 159);
		((Loueur) loueur).addBook(livre2);
		((Loueur) loueur).addBook(livre2);
		((Loueur) loueur).addBook(livre2);

		
		 System.out.println(((Loueur)loueur).booksNumber());
		 System.out.println(((Loueur)loueur).listBooks());
		
		// Création auteurs
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		    Date date = format.parse("1802-01-02"); 
		    Auteurs hugo = Auteurs.getAuteurs("Hugo", "Victor", date);
		    
		   // try {
		   // asimov = Auteurs.getAuteur();
		    //.out.println(asimov.getNom());
		    
		    
		   // } catch(ParseException parseException) {
		   // 	System.out.println("La date de naissance est incorrecte");
		   // 	System.out.println(parseException.getLocalizedMessage());
		   // } catch(DateNaissanceException naissance ) {
		    //	System.out.println(naissance.getLocalizedMessage());
		    	
		  //  }

		    
		    System.out.println(hugo.getNom());
		    
		    
		
		//Livres livre = new Livres("Les Misérables", "Bla bla bla", 1);
		//((Loueur) loueur).addBook(livre);
		    
		   // Création d'auteurs à partir du fichier texte
		    
		    AuteurImport auteurs = new AuteurImport();
		    ArrayList<Auteurs> auteur = new ArrayList<Auteurs>();
		    
		   
			for(String[] unAuteur : auteurs.getAuteurs()) {
				
				//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		       try {
				Date date1 = format.parse(unAuteur[2]); 
				Auteurs contenu = Auteurs.getAuteurs(unAuteur[0], unAuteur[1], date1); // getAuteurs nous retourne une instanc d'un nouvel instance
				
                auteur.add(contenu);
		     } catch(Exception e){
				
			}
			}
			System.out.println(auteur.size());
			System.out.println(((Loueur)loueur).getCollectionSize(false));
			
		    
		
	}
	
	private static Utilisateur createLoueur() {
		return new Loueur()
				.nom("Aubert")
				.prenom("Jean-Luc")
				.numAdherent("021587453");
	}
	// Utilisateur loueur = CreateUser.createLoueur();
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("5584518454");
	}
	// Utilisateur emprunteur = CreateUser.createEmprunteur();
		
		
    private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
					.nom("Turchi")
					.prenom("Nicolas")
					.numAdherent("021585547453");
    }
    
    
    // Utilisateur emprunteurLoueur = createEmprunteurLoueur();
    
}
