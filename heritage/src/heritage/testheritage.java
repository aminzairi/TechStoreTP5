package heritage;
public class testheritage {
    public static void main(String[] args) {
        Adulte a1 = new Adulte("Amine", 35, "0612345678", "Ingénieur");
        Enfant e1 = new Enfant("Sami", 10, "0698765432", "École primaire");
        Bebe b1 = new Bebe("Lina", 1, "0600000000", true);

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);

        // Q20
        System.out.println("Nom de l'adulte : " + a1.getNom());
        System.out.println("Nom de l'enfant : " + e1.getNom());
        System.out.println("Nom du bébé : " + b1.getNom());
        System.out.println("Téléphone de l'adulte : " + a1.getTelephone());
    }
}