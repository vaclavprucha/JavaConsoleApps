package RPGHra;

public class Polozka {
    private String nazev;
    private String typ; // "leciva", "zbran", atd.
    private int hodnota;

    public Polozka(String nazev, String typ, int hodnota) {
        this.nazev = nazev;
        this.typ = typ;
        this.hodnota = hodnota;
    }

    public String getNazev() { return nazev; }
    public String getTyp() { return typ; }
    public int getHodnota() { return hodnota; }

    public void pouzij(Hrdina hrdina) {
        if (typ.equals("leciva")) {
            hrdina.setZivoty(hrdina.getZivoty() + hodnota);
            System.out.println("Pouzil jsi " + nazev + " a obnovil " + hodnota + " zivotu.");
        }
        // Pripadne dalsi typy – zbrane, obrana atd.
    }
}
