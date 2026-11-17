package heritage;
public class Enfant extends Personne {
    private String nomEcole;
    public Enfant(String nom, int age,String telepohne ,String nomEcole) {
        super(nom, age,telepohne);
        this.nomEcole = nomEcole;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", école : " + nomEcole;

    }
}