import java.awt.*;

public class Bijou extends Bien {

    private String bijouClr;


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
}
