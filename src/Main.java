public
class Main {
    public static
    void main(String[] args) {

        Habitant habitant1 = new Habitant("Albert", "Polak", 9400.30);
        Habitant habitant2 = new Habitant("Bob", "Lonzo", 1541.7);
        Habitant habitant3 = new Habitant("Céline", "Goutier", 600.99);
        Habitant habitant4 = new Habitant("Dominique", "Dio", 9458.14);
        Habitant habitant5 = new Habitant("Eric", "Marloi", 6971.22);

        Bien bijou1 = new Bijou(97.45, "bleu");
        Bien bijou2 = new Bijou(50, "bleu");
        Bien bijou3 = new Bijou(85, "bleu");
        Bien bijou4 = new Bijou(79.99, "bleu");
        Bien bijou5 = new Bijou(125.5, "bleu");
        Bien bijou6 = new Bijou(97.45, "rouge");
        Bien bijou7 = new Bijou(45, "rouge");
        Bien bijou8 = new Bijou(71.54, "rouge");
        Bien bijou9 = new Bijou(54.91, "rouge");
        Bien bijou10 = new Bijou(35.99, "rouge");
        Bien bijou11 = new Bijou(99.99, "rouge");
        Bien bijou12 = new Bijou(24.3, "rouge");
        Bien bijou13 = new Bijou(66.6, "noir");

        habitant1.ajouterBiens(bijou1, bijou2, bijou3, bijou6, bijou7);
        habitant2.ajouterBiens(bijou8, bijou9, bijou10);
        habitant3.ajouterBiens(bijou4, bijou11, bijou12);
        habitant4.ajouterBiens(bijou5, bijou13);

        Bien livre1 = new Livre(17.05, "Blake et Mortimer - Tome 11 : Le dernier pharaon");
        Bien livre2 = new Livre(9.5, "La Terre des morts");
        Bien livre3 = new Livre(20.81, "Feu et Sang - Les origines de Game of Thrones Tome 2 : Le règne des Targaryen");
        Bien livre4 = new Livre(18.05, "Le schmock");

        habitant2.ajouterBiens(livre1, livre2);
        habitant3.ajouterBiens(livre3);
        habitant4.ajouterBiens(livre4);

        habitant1.afficherBien();
        habitant1.totalBienValeur();

    }
}
