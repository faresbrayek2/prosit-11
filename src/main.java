import java.util.Map;
import java.util.TreeMap;

public class maini {

    public static void main(String[] args) {
        AffectationHashMap mapED = new AffectationHashMap();

        Employe erij = new Employe("erij");
        Employe hiii = new Employe("hiii");
        Employe aaa = new Employe("aaa");

        Departement rh = new Departement("ddd");
        Departement ccc = new Departement("ccc");
        Departement rrr = new Departement("rrr");

        mapED.ajouterEmployeDepartement(erij, rh);
        mapED.ajouterEmployeDepartement(hiii, ccc);
        mapED.ajouterEmployeDepartement(aaa, rrr);

        mapED.afficherEmployesEtDepartements();


        try {
            mapED.ajouterEmployeDepartement(erij, ccc);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


        mapED.afficherEmployesEtDepartements();
        mapED.supprimerEmploye(erij);
        mapED.afficherEmployesEtDepartements();
        mapED.supprimerEmployeEtDepartement(hiii, ccc);
        mapED.afficherEmployesEtDepartements();
        mapED.afficherEmployes();
        mapED.afficherDepartements();

        System.out.println(mapED.rechercherEmploye(erij));
        System.out.println(mapED.rechercherDepartement(ccc));
        TreeMap<Employe, Departement> maptreeED = mapED.trierMap();
        for (Map.Entry<Employe, Departement> entry : maptreeED.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }
    }
    
}