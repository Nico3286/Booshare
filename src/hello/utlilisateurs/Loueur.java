/**
 * 
 */
package hello.utlilisateurs;

import java.util.ArrayList;

import hello.livres.Livres;
import hello.utlilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface {
	private ArrayList<Livres> books; // création d'une liste (tableau sans dimension) Arraylist est une classe
	
	public Loueur() {
		this.books = new ArrayList<Livres>(); // Les () : je fais appel au constructeur de la classe ArrayList
		
	}
	
	// private Livres[] books; // la variable books désigne le tableau dans lequel on va ranger des objets de type livres

	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();  // += concaténation
		return message;  // return obligatoire quand il y a un type (String) avant la méthode. Si void, pas de retour.
	}
	
	public String listBooks() {
		String message = "Livre de la collection de " + this.nom + "\n";
		
		// Boucle sur la collection des livres
		for(Livres livre : this.books) {
			message += livre.getTitre() + "\n";
			}
		
		return message;
		
		
	}
	
	@Override
	public Utilisateur addBook(Livres livre) {
		//if (!this.books.contains(livre)) {  // ! transforme ce qui suit en forme négative
		this.books.add(livre);
		//}
		return this;
	}

	@Override
	public Utilisateur loan(Livres livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
