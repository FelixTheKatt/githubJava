package datas;

public
enum Taille {


    XS("Très petit"),
    S("Petit"),
    M("Moyen"),
    L("Large"),
    XL("Extra large");

    private String taille;

    Taille(String taille) {

        this.taille = taille;
    }

    public
    String getTaille() {
        return taille;
    }
}
