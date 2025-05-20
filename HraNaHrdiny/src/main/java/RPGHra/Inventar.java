package RPGHra;

import java.util.ArrayList;

public class Inventar {
    private ArrayList<Polozka> polozky;

    public Inventar() {
        this.polozky = new ArrayList<>();
        // Pro testovani dame hraci jeden lektvar
        polozky.add(new Polozka("Maly lektvar leceni", "leciva", 30));
    }

    public void vypisObsah() {
        if (polozky.isEmpty()) {
            System.out.println("Inventar je prazdny.");
            return;
        }

        System.out.println("Inventar:");
        for (int i = 0; i < polozky.size(); i++) {
            Polozka p = polozky.get(i);
            System.out.println((i + 1) + ". " + p.getNazev() + " [" + p.getTyp() + "]");
        }
    }

    public void pouzijPolozku(Hrdina hrdina) {
        if (polozky.isEmpty()) {
            System.out.println("Nemas zadne polozky.");
            return;
        }

        System.out.println("Vyber polozku k pouziti:");
        vypisObsah();

        int volba = Nastroje.ctiVolbu(1, polozky.size());
        Polozka vybrana = polozky.get(volba - 1);
        vybrana.pouzij(hrdina);
        polozky.remove(volba - 1); // odebereme po pouziti
    }

    public void pridejPolozku(Polozka p) {
        polozky.add(p);
    }
}
