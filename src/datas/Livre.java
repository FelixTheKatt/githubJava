package datas;

import Habitants.Habitant;
import datas.Bien;
import datas.Interfaces.Louable;

public
class Livre extends Bien implements Louable {

    private String titre;

    public
    Livre(double prix, String titre) {
        super(prix);
        setTitre(titre);
    }

    public
    String getTitre() {
        return titre;
    }

    public
    void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public
    String toString() {

        return "datas.Livre à " + getPrix() + ".\n" + "Titre: " + getTitre();
    }

    @Override
    public
    void louable(Habitant habitant, int jour) {
        double prix = (getPrix() * jour);
        double pourcent = (prix * 15) / 100;
        habitant.setArgent(habitant.getArgent() - pourcent);
    }
}
