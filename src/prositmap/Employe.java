/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositmap;

/**
 *
 * @author Lenovo
 */
public class Employe implements Comparable<Employe>{
    
    private int cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe() {
    }

    public Employe(int cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return cin;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int compareTo(Employe o) {
        return cin-o.cin;
    }
    
    
    
    
}