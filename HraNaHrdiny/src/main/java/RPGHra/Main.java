package RPGHra;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vitej v textove RPG hre!");
        Hrdina hrdina = TvorbaPostavy.vytvorHrdinu();

        while (true) {
            System.out.println("\n1 - Bojovat\n2 - Zobrazit stav\n3 - Konec");
            int volba = Nastroje.ctiVolbu(1, 3);

            switch (volba) {
                case 1 -> Boj.spustBoj(hrdina, Nepritel.generujNahodnehoNepritele());
                case 2 -> hrdina.zobrazStav();
                case 3 -> {
                    System.out.println("Diky za hrani!");
                    return;
                }
            }
        }
    }
}