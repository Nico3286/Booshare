/**
 * 
 */
package hello.utlilisateurs;

import hello.livres.Livres;
import hello.utlilisateurs.interfaces.EmprunteurInterface;
import hello.utlilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class EmprunteurLoueur extends Utilisateur implements EmprunteurInterface, LoueurInterface {

	/**
	 * 
	 */
	public EmprunteurLoueur() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.LoueurInterface#addBook(hello.livres.Livres)
	 */
	@Override
	
	//public Utilisateur toEmprunteur() {
	//	return new Emprunteur();
	//}
	
	public Utilisateur addBook(Livres livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.LoueurInterface#loan(hello.livres.Livres)
	 */
	@Override
	public Utilisateur loan(Livres livre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.LoueurInterface#calculeCotisation()
	 */
	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
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
	 * @see hello.utlilisateurs.interfaces.EmprunteurInterface#createBookBorrowing(hello.utlilisateurs.Loueur, hello.livres.Livres)
	 */
	@Override
	public Utilisateur createBookBorrowing(Loueur loueur, Livres livres) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.utlilisateurs.interfaces.EmprunteurInterface#returnBook(hello.utlilisateurs.Loueur, hello.livres.Livres)
	 */
	@Override
	public Utilisateur returnBook(Loueur loueur, Livres livres) {
		// TODO Auto-generated method stub
		return null;
	}

}
