public class Employe implements Comparable<Employe>{
    private String nom;
    public Employe(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public int compareTo(Employe e) {
        // Implement your comparison logic here
        return this.nom.compareTo(e.nom);
    }
}
