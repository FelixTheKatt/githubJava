import java.util.ArrayList;

public
class Habitant {
    private String nom;
    private String prenom;
    private Double argent;
    private ArrayList<Bien> biens ;

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
    public void ajouterBiens (Bien bien){
        biens.add(bien);
    }
    public void ajouterBiens (Bien bien,Bien bien2){
        biens.add(bien);
        biens.add(bien2);
    }
    public void ajouterBiens (Bien bien,Bien bien2,Bien bien3){
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
    }
    public void ajouterBiens (Bien bien,Bien bien2,Bien bien3,Bien bien4){
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
        biens.add(bien4);
    }
    public void ajouterBiens (Bien bien,Bien bien2,Bien bien3,Bien bien4,Bien bien5){
        biens.add(bien);
        biens.add(bien2);
        biens.add(bien3);
        biens.add(bien4);
        biens.add(bien5);
    }
    public void afficherBien(){
        getBiens().forEach(x -> System.out.println(x.toString()));
    }
    public void totalBienValeur(){
        System.out.println(getBiens().stream().mapToDouble(Bien::getPrix).sum());
    }
    public void achatBien(Habitant habitant,Bien bien){
        habitant.setArgent(habitant.getArgent()+bien.getPrix());
        getBiens().add(bien);
        habitant.getBiens().remove(bien);
    }
}