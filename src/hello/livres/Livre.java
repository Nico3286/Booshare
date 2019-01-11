/**
 * 
 */
package hello.livres;

/**
 * @author Dell
 *
 */
public class Livre {

	private String titre;
	private String resume;
	private int nbPages;

	// Définition d'une constante de classe
	// le mot clé FINAL interdit la modification de la valeur !
	private final int MINPAGES = 4;

	/**
	 * Constructeur d'une classe Java Porte le nom de la classe
	 */
	public Livre(String titre, String resume, int nbPages) {

		this.titre = titre;
		this.resume = resume;

		if (nbPages >= MINPAGES) {
			this.nbPages = nbPages;
		}

		else {
			this.nbPages = MINPAGES;
		}
	}


	public String getTitre() {
		return titre;
	}

	public String getResume() {
		return resume;
	}

	public int getNbPages() {
		return nbPages;
	}
}
