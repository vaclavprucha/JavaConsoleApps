package RPGHra;

import java.util.Scanner;

public class Nastroje {
    private static Scanner scanner = new Scanner(System.in);

    public static int ctiVolbu(int min, int max) {
        int volba;
        do {
            System.out.print("Zadej volbu (" + min + "-" + max + "): ");
            volba = scanner.nextInt();
        } while (volba < min || volba > max);
        return volba;
    }

    public static int nahodneCislo(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
