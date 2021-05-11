package be.ehb.spring_boot_demo.model;

import java.util.HashSet;

public class DataSource {

    private HashSet<Evenement> evenementHashSet;

    public DataSource() {
        evenementHashSet = new HashSet<>();
    }

    public void addEvenement(Evenement evenement){
        evenementHashSet.add(evenement);
    }

    public Evenement getEvenementById(int id){
        for(Evenement element : evenementHashSet) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    public HashSet<Evenement> getEvenementHashSet() {
        return evenementHashSet;
    }
}
