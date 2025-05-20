package RPGHra;

import java.util.Scanner;

public class TvorbaPostavy {
    public static Hrdina vytvorHrdinu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadej jmeno postavy: ");
        String jmeno = scanner.nextLine();

        System.out.println("Vyber povolani:");
        System.out.println("1 - Bojovnik\n2 - Mag\n3 - Zlodej");
        int volba = Nastroje.ctiVolbu(1, 3);

        String povolani;
        switch (volba) {
            case 1 -> povolani = "Bojovnik";
            case 2 -> povolani = "Mag";
            case 3 -> povolani = "Zlodej";
            default -> povolani = "Dobrodruh";
        }

        System.out.println("Vytvorena postava: " + jmeno + " (" + povolani + ")");
        return new Hrdina(jmeno, povolani);
    }
}
