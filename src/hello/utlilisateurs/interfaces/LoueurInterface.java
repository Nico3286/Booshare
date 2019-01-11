/**
 * 
 */
package hello.utlilisateurs.interfaces;

import hello.livres.Livre;
import hello.utlilisateurs.Utilisateur;

/**
 * @author Dell
 *
 */
public interface LoueurInterface {
		public Utilisateur addBook(Livre livre);
		public Utilisateur loan(Livre livre);
		public Utilisateur calculeCotisation();
	}

