package RPGHra;

public class Boj {
    public static void spustBoj(Hrdina hrdina, Nepritel nepritel) {
        System.out.println("Narazil jsi na nepritele: " + nepritel.getJmeno());

        while (hrdina.getZivoty() > 0 && nepritel.getZivoty() > 0) {
            System.out.println("1 - Utok | 2 - Pouzit predmet | 3 - Utek");
            int volba = Nastroje.ctiVolbu(1, 3);

            switch (volba) {
                case 1 -> {
                    int zraneni = Nastroje.nahodneCislo(10, 20);
                    nepritel.setZivoty(nepritel.getZivoty() - zraneni);
                    System.out.println("Zasahl jsi nepritele za " + zraneni + " bodu.");
                }
                case 2 -> hrdina.getInventar().pouzijPolozku(hrdina);
                case 3 -> {
                    System.out.println("Utikas z boje!");
                    return;
                }
            }

            if (nepritel.getZivoty() > 0) {
                int zraneni = nepritel.getSila();
                hrdina.setZivoty(hrdina.getZivoty() - zraneni);
                System.out.println("Nepritel te zranil za " + zraneni + " bodu.");
            }
        }

        if (hrdina.getZivoty() > 0) {
            System.out.println("Zvitezil jsi!");
            hrdina.pridejZkusenosti(50);
        } else {
            System.out.println("Byl jsi porazen...");
        }
    }
}
