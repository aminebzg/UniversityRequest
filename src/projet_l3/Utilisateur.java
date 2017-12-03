/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_l3;

/**
 *
 * @author Amine
 */
public class Utilisateur {
    
    String identifiantUtilisateur;
    String motDePasseUtilisateur;
    String nomUtilisateur;
    String prenomUtilisateur;
    
    boolean estConnecte;
    
    public Utilisateur(String identifiantUtilisateur, String motDePasseUtilisateur, String nomUtilisateur, String prenomUtilisateur){
        this.identifiantUtilisateur=identifiantUtilisateur;
        this.motDePasseUtilisateur=motDePasseUtilisateur;
        this.nomUtilisateur=nomUtilisateur;
        this.prenomUtilisateur=prenomUtilisateur;
        estConnecte=false;
    }
    
    public String getNom(){
        return this.nomUtilisateur;
    }
    
    public String getPrenom(){
        return this.prenomUtilisateur;
    }

    
}
