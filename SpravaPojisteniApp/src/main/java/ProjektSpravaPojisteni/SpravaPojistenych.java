package ProjektSpravaPojisteni;

import java.util.ArrayList;

    /**
    * Třída pro přidávání, vyhledávání a výpis osob
    */

public class SpravaPojistenych {
    private ArrayList<PojistenaOsoba> osoby;

    /**
     * Konstruktor pro nový seznam
     */

    public SpravaPojistenych() {
        osoby = new ArrayList<>();
    }

    /**
     * Přidání nové osoby do seznamu
     */

    public void pridatOsobu(PojistenaOsoba osoba) {
        osoby.add(osoba);
    }

    /**
     * Výpis všech osob ze seznamu
     */

    public void zobrazVsechny() {
        if (osoby.isEmpty()) {
            System.out.println("Seznam je prázdný.");
        } else {
            for (PojistenaOsoba osoba : osoby) {
                System.out.println(osoba);
            }
        }
    }

    /**
     * Vyhledání osoby ze seznamu podle jména a příjmení
     */

    public void vyhledatOsobu(String jmeno, String prijmeni) {
        boolean nalezeno = false;
        for (PojistenaOsoba osoba : osoby) {
            if (osoba.getJmeno().equalsIgnoreCase(jmeno) && osoba.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println(osoba);
                nalezeno = true;
            }
        }
        if (!nalezeno) {
            System.out.println("Pojištěná osoba nebyla nalezena.");
        }
    }
}