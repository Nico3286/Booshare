/**
 * 
 */
package hello.utlilisateurs.interfaces;

import hello.livres.Livres;
import hello.utlilisateurs.Utilisateur;

/**
 * @author Dell
 *
 */
public interface LoueurInterface {
		public Utilisateur addBook(Livres livre);
		public Utilisateur loan(Livres livre);
		public Utilisateur calculeCotisation();
	}

