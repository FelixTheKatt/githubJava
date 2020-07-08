package habitants;

import datas.Bien;
import datas.Bijou;
import datas.Livre;
import datas.Vetement;

import java.util.ArrayList;

public
class Habitant {
    private String nom;
    private String prenom;
    private Double argent;
    private  ArrayList<Bien> biens;
    private final ArrayList<Bien> biensvendu= new ArrayList<>();

    public
    Habitant() {
    }

    public
    Habitant(String nom, String prenom, Double argent) {
        setNom(nom);
        setPrenom(prenom);
        setArgent(argent);
        setBiens(new ArrayList<>());
    }

    public
    void ajouterBiens(Bien bien) {
        biens.add(bien);
    }

    public
    void ajouterBiens(Bien bien, Bien bien2) {
        biens.add(bien);
        biens.add(bien2);
    }

    public
    void ajouterBiens(Bien bien, Bien bien2, Bien bien3) {
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
    }

    public
    void ajouterBiens(Bien bien, Bien bien2, Bien bien3, Bien bien4) {
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
        biens.add(bien4);
    }

    public
    void ajouterBiens(Bien bien, Bien bien2, Bien bien3, Bien bien4, Bien bien5) {
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
        biens.add(bien4);
        biens.add(bien5);
    }

    public
    void afficherBien() {
        getBiens().forEach(x -> System.out.println(x.toString()));
    }

    public
    void totalBienValeur() {
        System.out.println(getBiens().stream().mapToDouble(Bien::getPrix).sum());
    }

    public
    void achatBien(Habitant habitant, Bien bien) {
        habitant.setArgent(habitant.getArgent() + bien.getPrix());
        setArgent(getArgent() - bien.getPrix());
        getBiens().add(bien);
        habitant.getBiens().remove(bien);
        habitant.getBiensVendu().add(bien);
    }

    public
    void louerBien(Habitant habitant, Bien bien, int jour) {
        if (habitant.getBiens().contains(bien)) {
            if (bien instanceof Bijou) {

                double prix = (bien.getPrix() * jour);
                double pourcent = (prix * 15) / 100;
                setArgent(getArgent() - pourcent);
            }

            if (bien instanceof Livre) {
                int nb = jour / 15;
                if (jour % 15 != 0 || nb == 0) {

                    nb += 1;
                }
                double prix = (bien.getPrix() * nb);
                double pourcent = (prix * 10) / 100;
                setArgent(getArgent() - pourcent);
            }
        } else {
            System.out.println("wrong param");
        }

    }

    public
    void louerService(Habitant habitant, String service, int jour) {
        int pricePerDay = 75;
        int total = jour * pricePerDay;
        switch (service.toLowerCase()) {
            case "tondre":
                System.out.println(habitant.getNom() + " tond" + " chez" + " " + getNom() + " " + jour + " jours " + total);
                setArgent(getArgent() + total);
                habitant.setArgent(getArgent() + total);
                break;
            case "laver":
                System.out.println(habitant.getNom() + " lave" + " chez" + " " + getNom() + " " + jour + "jours " + total);
                setArgent(getArgent() + total);
                habitant.setArgent(getArgent() + total);
                break;
            default:
                System.out.println("pas de service " + habitant.getNom() + " n'es past un esclave");
        }
    }


    @Override
    public
    String toString() {
        return "Habitants.Services.Habitant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", argent=" + argent +
                ", biens=" + getBiens() +
                '}';
    }

    public void getRembours(Bien bien,Habitant habitant){

        if (bien instanceof Bijou || bien instanceof Vetement){

            if(habitant.getBiensVendu().contains(bien)){

                setArgent(getArgent()+bien.getPrix());
                getBiens().remove(bien);

                habitant.setArgent(habitant.getArgent()-bien.getPrix());
                habitant.ajouterBiens(bien);
                habitant.getBiensVendu().remove(bien);
            }

            else System.out.println("Ce bien n'a pas été vendu par ce vendeur");
        }

        else System.out.println("Ce bien n'est pas remboursable");
    }

    private ArrayList<Bien> getBiensVendu() {

        return biensvendu;
    }

    public
    String getNom() {
        return nom;
    }

    private
    void setNom(String nom) {
        this.nom = nom;
    }

    public
    String getPrenom() {
        return prenom;
    }

    private
    void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public
    Double getArgent() {
        return argent;
    }

    private
    void setArgent(Double argent) {
        this.argent = argent;
    }

    public
    ArrayList<Bien> getBiens() {
        return biens;
    }

    private
    void setBiens(ArrayList<Bien> biens) {
        this.biens = biens;
    }
}
