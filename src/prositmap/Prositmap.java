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
public class Prositmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employe e1=new Employe(1, "employe1", "Mabrouk", "Amal");
        Employe e2=new Employe(2, "employe2", "Marzouk", "Mariem");
        Employe e3=new Employe(3, "employe3", "Smiri", "Imen");
        Employe e4=new Employe(3, "employe4", "Smiri1", "Imen1");
        
        Departement d1=new Departement(1, "Mobile");
        Departement d2=new Departement(2, "Web");
        
       
        SocieteTreeMap societe=new SocieteTreeMap();
        societe.ajouterEmployeDepartement(e1, d1);
        societe.ajouterEmployeDepartement(e2, d1);
        societe.ajouterEmployeDepartement(e3, d2);
        societe.ajouterEmployeDepartement(e4, d1);
        
        
        societe.afficherLesEmployesLeursDepartements();
        
         
    }
    
}
