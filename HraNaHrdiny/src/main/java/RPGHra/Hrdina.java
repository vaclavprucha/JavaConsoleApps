package RPGHra;

public class Hrdina {
    private String jmeno;
    private String povolani;
    private int zivoty;
    private int uroven;
    private int zkusenosti;
    private Inventar inventar;

    public Hrdina(String jmeno, String povolani) {
        this.jmeno = jmeno;
        this.povolani = povolani;
        this.zivoty = 100;
        this.uroven = 1;
        this.zkusenosti = 0;
        this.inventar = new Inventar();
    }

    public void zobrazStav() {
        System.out.println(jmeno + " (" + povolani + ") - Zivoty: " + zivoty + ", Uroven: " + uroven + ", Zkusenosti: " + zkusenosti);
        inventar.vypisObsah();
    }

    public void pridejZkusenosti(int xp) {
        zkusenosti += xp;
        if (zkusenosti >= uroven * 100) {
            uroven++;
            zivoty += 20;
            System.out.println("Postoupil jsi na uroven " + uroven + "!");
        }
    }

    // Gettery a settery
    public int getZivoty() {
        return zivoty;
    }
    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }
    public Inventar getInventar() {
        return inventar;
    }
}
