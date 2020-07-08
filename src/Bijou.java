import java.awt.*;

public class Bijou extends Bien {

    private String bijouClr;
    private final int remboursement=95;


    public Bijou(double prix, String bijouClr) {
        super(prix);
        setBijouClr(bijouClr);
    }

    public String getBijouClr() {
        return bijouClr;
    }

    public void setBijouClr(String bijouClr) {
        this.bijouClr = bijouClr;
    }

    public int getRemboursement() {
        return remboursement;
    }


    public void setPrix(double prix) {

        if(prix>getPrix()) super.setPrix(prix);
    }


    @Override
    public String toString() {

        return "Bijou à "+getPrix()+".\n"+"Couleur: "+getBijouClr();
    }
}
