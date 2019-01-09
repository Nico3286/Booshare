/**
 * 
 */
package hello.utlilisateurs;

import hello.livres.Livres;
import hello.utlilisateurs.interfaces.EmprunteurInterface;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur implements EmprunteurInterface {

	/**
	 * 
	 */
	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.EmprunteurInterface#facturation()
	 */
	@Override
	public Utilisateur facturation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.
	 * EmprunteurInterface#createBookBorrowing(hello.utlilisateurs.Loueur, hello.livres.Livres)
	 */
	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livres livres) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.
	 * EmprunteurInterface#returnBook(hello.utlilisateurs.Loueur, hello.livres.Livres)
	 */
	@Override
	public Utilisateur returnBook(Loueur loueur, Livres livres) {
		// TODO Auto-generated method stub
		return null;
	}

}
