/**
 * 
 */
package hello.utlilisateurs;

import hello.livres.Livres;

/**
 * @author Dell
 *
 */
public class CreateUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		// Créer de livres
		Livres livre = new Livres("Les Misérables", "Bla bla bla", 1);
		((Loueur) loueur).addBook(livre);
		((Loueur) loueur).addBook(livre);
		
		
		System.out.println(((Loueur)loueur).listBooks());
		
		
		
		//Livres livre = new Livres("Les Misérables", "Bla bla bla", 1);
		//((Loueur) loueur).addBook(livre);
		
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
