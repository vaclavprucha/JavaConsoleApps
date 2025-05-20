# Evidence pojištěných osob (Java konzolová aplikace)

Tato aplikace slouží k jednoduché evidenci pojištěných osob v konzoli. Umožňuje přidávat, vyhledávat a zobrazovat pojištěné osoby. Vše probíhá přes textové uživatelské rozhraní.

## Funkce

* Přidání nové pojištěné osoby (jméno, příjmení, věk, telefon)
* Vypsání všech pojištěných
* Vyhledávání pojištěné osoby podle jména a příjmení
* Ošetření neplatných vstupů (prázdný text, věk mimo rozsah, neplatné číslo)

## Použité třídy

* `Main` – spouští aplikaci
* `UzivatelskeRozhrani` – zajišťuje komunikaci s uživatelem
* `SpravaPojistenych` – logika pro přidávání, hledání a výpis osob
* `PojistenaOsoba` – datová struktura reprezentující pojištěnou osobu

## Spuštění

1. Ujisti se, že máš nainstalovanou Javu (JDK 17 nebo novější).
2. Zkompiluj projekt:

   ```bash
   javac Main.java UzivatelskeRozhrani.java SpravaPojistenych.java PojistenaOsoba.java
   ```
3. Spusť program:

   ```bash
   java Main
   ```

## Příklad spustitelného menu

```
-------------------------------
Evidence pojištěných osob
-------------------------------
1 - Přidat nového pojištěného
2 - Vypsat všechny pojištěné
3 - Vyhledat pojištěného
4 - Konec
Zadejte volbu:
```

## Autor

Václav Průcha
