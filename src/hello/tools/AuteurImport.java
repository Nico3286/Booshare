package hello.tools;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AuteurImport {
		private File auteurFile;
		private static final String FIELD_SEP= ";";
		private ArrayList<String[]> auteurs;  // ArrayList est une classe il faut donc l'instancifier
		                                      // voir ligne 20
//	private static
		
		// TODO Auto-generated constructor stub
		
		public AuteurImport() {
			// instancifier le ArrayList
			this.auteurs = new ArrayList<String[]>();
			
			
			// instancifier la classe File
			this.auteurFile = new File("C:\\Users\\Dell\\Desktop\\auteur.txt");
			if (this.auteurFile.exists()) {
				if (auteurFile.canRead()) {
					this.process();
			} else {
				System.out.println("Le fichier n'est pas lisible");
			}
			} else {
				System.out.println("Le fichier demandé n'existe pas");
			}
			
		}
		
		public ArrayList<String[]> getAuteurs() {
			return this.auteurs;
		}
		
		/** trouver un moyen de créer des colonnes
		 * pour chaque ligne
		 */
		private void process() {
			try {
				@SuppressWarnings("resource")
				Scanner fileScanner = new Scanner(this.auteurFile);
				
				int rowCount = 0;		
				while(fileScanner.hasNext()) {  // while : tant que c'est vrai
					String row = fileScanner.nextLine();
					if (rowCount > 0) {
						// On doit parser row...
						String[] cols = row.split(FIELD_SEP);
						
						// On doit ranger le tableau dans un ArrayList
						this.auteurs.add(cols);
						
						
						
		
			// Vérification que du split
						
						//String message = "";
						//for(int i=0; i < cols.length; i++) {
						//	message += cols[i] + " ";
						//}
						//message += "\n";
						//System.out.println(message);
						
						
					}
					rowCount ++;
					// System.out.println(fileScanner.next());
				}
				
			} catch(IOException ioe) {
			
		}
		
		}
}
		
	
		
	
