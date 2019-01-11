/**
 * 
 */
package hello.utlilisateurs;

import java.util.ArrayList;

import java.util.HashMap;

import hello.livres.Livre;
import hello.utlilisateurs.interfaces.LoueurInterface;

// Interface fonctionnelle
interface GetSize {
	public int getSize(HashMap<Livre, Integer> livres, boolean getStock);
}

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface {
	private HashMap<Livre,Integer> books; // création d'une liste indexée HashMap est une classe
	
	public Loueur() {
		this.books = new HashMap<Livre,Integer>(); // Les () : je fais appel au constructeur de la classe HashMap
		
	}
	
	// private Livres[] books; // la variable books désigne le tableau dans lequel on va ranger des objets de type livres

	public String booksNumber() {
		String message = "Nombre de livres : ";
		message += this.books.size();  // += concaténation
		return message;  // return obligatoire quand il y a un type (String) avant la méthode. Si void, pas de retour.
	}
	
	
	public int getCollectionSize(boolean asStock) {
     	// this.asStock = asStock;
		GetSize size = (books, getStock) -> {  // size est une fonction
			if(!getStock) {
				return this.books.size();
			} else {
				int stock = 0;
			for(Livre livre : this.books.keySet()) {
				// stock += books.get(livre);
				stock = stock +  books.get(livre); // get va chercher la valeur de la clé qui est l'objet
			}
			return stock;
		          }
		
	   };
	
	return size.getSize(this.books, asStock);
	}
	
//	public String listBooks() {
//		String message = "Livre de la collection de " + this.nom + "\n";
//		
//		// Boucle sur la collection des livres
//		for(Livres livre : this.books) {
//			message += livre.getTitre() + "\n";
//			}
//		
//		return message;
//		
//		
//	}
	
	
	@Override
	public Utilisateur addBook(Livre livre) {
		//if (!this.books.contains(livre)) {  // ! transforme ce qui suit en forme négative
		if (this.books.containsKey(livre)) {
			Integer oldValue = this.books.get(livre); // get prend la valeur associée au livre dans le else
			oldValue = oldValue + 1;
			this.books.replace(livre, oldValue);
			//}
		} else {
			this.books.put(livre, 1);
		}
		 // put place le livre ds la case 1
		
		return this;
	}
	
	
	@Override
	public Utilisateur loan(Livre livre) {
		
      if (!this.books.containsKey(livre) && this.books.get(livre)<1) {
			
		} else {
				Integer oldValue = this.books.get(livre); // get prend la valeur associée au livre dans le else
			oldValue = oldValue - 1;
			this.books.replace(livre, oldValue);
			//}
		}
		 // put place le livre ds la case 1
		return this;
	}
	
	public String listBooks() { 
		String message = "Livres de la collection de " + this.prenom + " " + this.nom + "\n"; 
		// Boucle sur la collection des livres 
		for (Livre livre : this.books.keySet()) { 
			message += livre.getTitre() + ", qte : " + this.books.get(livre) + "\n"; } 
	return message; }
		

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
