/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositmap;
import java.util.HashMap;
import java.util.Map;
/**
 *import java.util.HashMap;
import java.util.Map;
 * @author Lenovo
 */
public class SocieteHashMap implements InterfaceSociete{
    
    Map<Employe, Departement> societe;

    public SocieteHashMap() {
        societe=new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        
        //societe.put(e, d);
        societe.putIfAbsent(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        //System.out.println(societe);
//        for(Employe e:societe.keySet())
//            System.out.println(e+"::"+societe.get(e));
        for(Map.Entry<Employe,Departement> en:societe.entrySet())
            System.out.println(en.getKey()+":::"+en.getValue());
    }

    @Override
    public void afficherLesEmployes() {
        for(Employe e: societe.keySet())
            System.out.println(e);
    }

    @Override
    public void afficherLesDepartements() {
        for(Departement d:societe.values())
            System.out.println(d);
    }

    @Override
    public void afficherDepartement(Employe e) {
        societe.get(e);
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societe.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return societe.containsValue(e);
    }
    
    
    
    
    
}

    

