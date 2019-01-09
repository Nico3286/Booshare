/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livres.Auteurs;
import hello.livres.Livres;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
        
		
		// Création des utilisateurs
        Utilisateur moi = new Loueur();
        moi.setNom ("Tartempion");
        moi.setPrenom("Jules");
        moi.setNumAdherent("57895429");
        
        System.out.println("Utilisateur : " + moi.getNom());
        
        Utilisateur lui = new Loueur("Bond", "James", "007");
        
        System.out.println("My name is : " + lui.getNom());
        
        Utilisateur alienLoueur = new Loueur();
        alienLoueur
              .nom("ET")
              .prenom("Dvorack")
              .numAdherent("755485588");
              ((Loueur) alienLoueur).setNbLivres(0);
              
              
        Utilisateur alienEmprunteur = new Emprunteur();
        alienEmprunteur
              .nom("ET")
              .prenom("Dvorack")
              .numAdherent("755485588");
              ((Emprunteur) alienEmprunteur).setNbLivres(1);
              ((Emprunteur) alienEmprunteur).setJours(11);
        
       
       // System.out.println("Maison de : " + alien.nom());
        
       // Création de livres
        Livres lesMiserables = new  Livres("Les Misérables", "Bla bla bla", 1);
        Livres fondation = new  Livres("Fondation", "Bli bli bli", 159);
        
        System.out.println("Résumé : " + lesMiserables.getResume() 
                           + "  Nombre de pages : " + lesMiserables.getNbPages());
       // Création des auteurs   
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = format.parse("2020-05-26"); 
        Auteurs hugo = Auteurs.getAuteurs("Hugo", "Victor", date);
        if (hugo == null) { System.out.println("Impossible de créer un auteur"); 
        } 
        else { System.out.println(hugo.getNom() + hugo.getPrenom() + hugo.getNaissance().toString()); }
        
        
        System.out.println("Cotisation de " + alienEmprunteur.getNom() + " : " 
                           +  ((Loueur) alienLoueur).cotisation + " Cout : "
        		           + ((Emprunteur) alienEmprunteur).cout );
	}

}
