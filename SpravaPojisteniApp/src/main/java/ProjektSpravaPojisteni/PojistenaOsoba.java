package ProjektSpravaPojisteni;

    /**
    * Třída pro jednu pojištěnou osobu
    */

public class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    /**
     * Konstruktor pro vytvoření pojištěné osoby podle zadaných údajů
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefon
     */

    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getTelefon() {
        return telefon;
    }

    /**
     * Výpis do konzole
     */

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", věk: " + vek + ", telefon: " + telefon;
    }
}