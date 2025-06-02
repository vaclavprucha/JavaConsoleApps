package RPGHra;

public class Nepritel {
    private String jmeno;
    private int zivoty;
    private int sila;

    public Nepritel(String jmeno, int zivoty, int sila) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
        this.sila = sila;
    }

    public String getJmeno() {
        return jmeno;
    }
    public int getZivoty() {
        return zivoty;
    }
    public void setZivoty(int zivoty) {
        this.zivoty = zivoty;
    }
    public int getSila() {
        return sila;
    }

    public static Nepritel generujNahodnehoNepritele() {
        String[] jmena = {"Kostlivec", "Goblin", "Temny rytir", "Obr"};
        String jmeno = jmena[Nastroje.nahodneCislo(0, jmena.length - 1)];
        int zivoty = Nastroje.nahodneCislo(30, 80);
        int sila = Nastroje.nahodneCislo(5, 15);
        return new Nepritel(jmeno, zivoty, sila);
    }
}
