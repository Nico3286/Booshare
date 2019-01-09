package hello.utlilisateurs;

public abstract class Utilisateur {
	protected String nom; 
	protected String prenom; 
	protected String numAdherent; 
	
	
	// Setter
	public Utilisateur nom(String nom) { 
		this.nom=nom; 
		return this; 
		
	}
	
	// Getter
	public String nom() {
		return this.nom;
	}

	// Setter
	public Utilisateur prenom(String prenom) { 
		this.prenom=prenom; 
		return this; 
		
	}
	
	// Getter
	public String prenom() {
		return this.prenom;
	}
	
	// Setter
		public Utilisateur numAdherent(String numAdherent) { 
			this.numAdherent=numAdherent; 
			return this; 
			
		}
		
	// Getter
		public String numAdherent() {
			return this.numAdherent;
		}
}
