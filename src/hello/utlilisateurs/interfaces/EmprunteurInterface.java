/**
 * 
 */
package hello.utlilisateurs.interfaces;

import hello.livres.Livres;
import hello.utlilisateurs.Loueur;
import hello.utlilisateurs.Utilisateur;

/**
 * @author Dell
 *
 */
public interface EmprunteurInterface {
	public Utilisateur facturation();
	public Utilisateur createBookBorrowing(Loueur loueur, Livres livres);
	public Utilisateur returnBook(Loueur loueur, Livres livres);
}


