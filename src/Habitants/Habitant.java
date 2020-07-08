package Habitants;

import datas.Bien;
import datas.Bijou;
import datas.Interfaces.Louable;
import datas.Vetement;

import java.util.ArrayList;

public
class Habitant implements IService {
    private final ArrayList<Bien> biensvendu = new ArrayList<>();
    private String nom;
    private String prenom;
    private Double argent;
    private ArrayList<Bien> biens;

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

    public
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

    public
    void ajouterBiens(Bien... biens) {
        for (Bien item : biens) {
            getBiens().add(item);
        }
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
        ((Louable) bien).louable(habitant, jour);
    }

    @Override
    public
    void louerService(Habitant habitant, String service, int jour) {
        final int pricePerDay = 75;
        int total = jour * pricePerDay;
        System.out.println(habitant.getNom() + " " + service + " chez" + " " + getNom() + " " + jour + " jours " + total);
        setArgent(getArgent() + total);
        habitant.setArgent(getArgent() + total);
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

    public
    void getRembours(Bien bien, Habitant habitant) {

        if (bien instanceof Bijou || bien instanceof Vetement) {

            if (habitant.getBiensVendu().contains(bien)) {

                setArgent(getArgent() + bien.getPrix());
                getBiens().remove(bien);

                habitant.setArgent(habitant.getArgent() - bien.getPrix());
                habitant.ajouterBiens(bien);
                habitant.getBiensVendu().remove(bien);
            } else System.out.println("Ce bien n'a pas été vendu par ce vendeur");
        } else System.out.println("Ce bien n'est pas remboursable");
    }

    private
    ArrayList<Bien> getBiensVendu() {

        return biensvendu;
    }


}
