package ProjektSpravaPojisteni;

import java.util.Scanner;

    /**
    * Třída pro komunikaci s uživatelem
    */

public class UzivatelskeRozhrani {
    private SpravaPojistenych sprava;
    private Scanner scanner;

    public UzivatelskeRozhrani() {
        sprava = new SpravaPojistenych();
        scanner = new Scanner(System.in);
    }

    /**
     * Hlavní metoda pro spuštění menu a výběru volby
     */

    public void spustit() {
        while (true) {
            vypisMenu();
            String volba = scanner.nextLine().trim();

            switch (volba) {
                case "1":
                    vytvorPojisteneho();
                    break;
                case "2":
                    sprava.zobrazVsechny();
                    break;
                case "3":
                    vyhledatPojisteneho();
                    break;
                case "4":
                    System.out.println("Ukončuji aplikaci...");
                    return;
                default:
                    System.out.println("Neplatná volba. Zadejte 1-4.");
            }
        }
    }

    /**
     * Výpis menu do konzole
     */

    private void vypisMenu() {
        System.out.println("\n-------------------------------");
        System.out.println("Evidence pojištěných osob");
        System.out.println("-------------------------------");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.print("Zadejte volbu: ");
    }

    /**
     * Načte neprázdný vstup
     */

    private String zadejNeprazdnyText(String vyzva) {
        String vstup;
        while (true) {
            System.out.print(vyzva);
            vstup = scanner.nextLine().trim();
            if (!vstup.isEmpty()) {
                return vstup;
            }
            System.out.println("Toto pole nesmí být prázdné.");
        }
    }

    /**
     * Vytvoří novou osobu po zadání všech údajů a uloží do seznamu
     */

    private void vytvorPojisteneho() {
        String jmeno = zadejNeprazdnyText("Zadejte jméno: ");
        String prijmeni = zadejNeprazdnyText("Zadejte příjmení: ");
        int vek = zadejCislo("Zadejte věk: ");
        String telefon = zadejTelefon("Zadejte telefonní číslo: ");

        PojistenaOsoba osoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefon);
        sprava.pridatOsobu(osoba);
        System.out.println("Pojištěný byl úspěšně přidán.");
    }

    /**
     * Vyhledá osobu podle zadaného jména a příjemní
     */

    private void vyhledatPojisteneho() {
        String jmeno = zadejNeprazdnyText("Zadejte jméno: ");
        String prijmeni = zadejNeprazdnyText("Zadejte příjmení: ");
        sprava.vyhledatOsobu(jmeno, prijmeni);
    }

    /**
     * Načte věk a zkotroluje zda je validní
     */

    private int zadejCislo(String vyzva) {
        while (true) {
            try {
                System.out.print(vyzva);
                String vstup = scanner.nextLine().trim();
                int cislo = Integer.parseInt(vstup);

                if (cislo >= 0 && cislo <= 120) {
                    return cislo;
                } else {
                    System.out.println("Zadejte věk v rozmezí 0 až 120 let.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Zadejte platné číslo.");
            }
        }
    }

    /**
     * Načte telefon a zkontroluje správný formát
     */

    private String zadejTelefon(String vyzva) {
        while (true) {
            System.out.print(vyzva);
            String vstup = scanner.nextLine().trim();
            String bezMezer = vstup.replaceAll(" ", "");
            if (bezMezer.matches("^\\+?\\d{9,12}$")) {
                return vstup;
            } else {
                System.out.println("Zadejte platné telefonní číslo.");
            }
        }
    }
}