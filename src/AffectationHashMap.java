import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> mapED;

    public AffectationHashMap() {
        this.mapED = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (mapED.containsKey(employe)) {
            throw new IllegalArgumentException("L'employe " + employe + " est deja affecte au departement " + mapED.get(employe));
        }

        mapED.put(employe, departement);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : mapED.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + "," + "Departement: " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employe employe) {
        mapED.remove(employe);
    }

    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        mapED.remove(employe, departement);
    }
    public void afficherEmployes() {
        for (Employe employe : mapED.keySet()) {
            System.out.println("Employe = " + employe);
        }
    }
    public void afficherDepartements() {
        for (Departement departement : mapED.values()) {
            System.out.println("Departement =" + departement);
        }
    }

    public boolean rechercherEmploye(Employe employe) {
        return mapED.containsKey(employe);
    }

    public boolean rechercherDepartement(Departement departement) {
        return mapED.containsValue(departement);
    }

    public TreeMap<Employe,Departement> trierMap() {
        Comparator<Employe> BynameComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.compareTo(e2);
            }
        };

        TreeMap<Employe,Departement> treemapED = new TreeMap<>(BynameComparator);
        treemapED.putAll(mapED);
        return treemapED;
    }

}
