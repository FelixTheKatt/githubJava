public class Vetement extends Bien{

    private Taille taille;
    private final int remboursement = 80;

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

    public int getRemboursement() {
        return remboursement;
    }


    @Override
    public String toString() {

        return "Vêtement à "+getPrix()+".\n"+"Taille: "+getTaille();
    }
}
