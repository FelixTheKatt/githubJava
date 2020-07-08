package datas;

import datas.Bien;

public
class Livre extends Bien {

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
}
