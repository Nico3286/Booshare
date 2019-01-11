/**
 * 
 */
package hello.utlilisateurs.interfaces;

import hello.livres.Livre;
import hello.utlilisateurs.Loueur;
import hello.utlilisateurs.Utilisateur;

/**
 * @author Dell
 *
 */
public interface EmprunteurInterface {
	public Utilisateur facturation();
	public Utilisateur createBookBorrowing(Loueur loueur, Livre livres);
	public Utilisateur returnBook(Loueur loueur, Livre livres);
}


