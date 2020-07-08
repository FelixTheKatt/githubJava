public class Vetement extends Bien{

    private Taille taille;

    public Vetement(double prix,Taille taille) {
        super(prix);
        setTaille(taille);

    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }
}
