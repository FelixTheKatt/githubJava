public class Bien {

    private  double prix;

    public Bien(double prix) {
        setPrix(prix);
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {

        if(prix<0) this.prix=0;
        else this.prix = prix;
    }
}
