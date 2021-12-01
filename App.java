package test;

import java.util.Scanner;

public class App {

    private static int validatePIN = 1234;
    private static int attemp = 0;
    private static double amount = 30000;
    private static boolean input = true;
    private static int JMBG = 123456789;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //test aplikacija
        checkUser();
        mainWindow();
        chose();
    }

    public static void checkUser() {

        System.out.println("Unesite vas PIN:");
        int userPIN = 0;
        while (userPIN != validatePIN && attemp <= 3) {
            userPIN = scanner.nextInt();
            attemp++;
            if (userPIN == validatePIN) {
                System.out.println("Dobro dosli u Vasu banku!");
            } else {
                System.out.println("Pogresan PIN, pokusaj ponovo.");
                if (attemp > 3) {
                    System.out.println("Vasa kartica je blokirana");
                    System.exit(1);
                }
            }
        }
    }

    public static void mainWindow() {
        System.out.println("");
        System.out.println("1.Uplata gotovine");
        System.out.println("2.Podizanje gotovine");
        System.out.println("3.Upit stanja");
        System.out.println("4.Promena PIN-a");
        System.out.println("5.Odblokiranje PIN-a");
        System.out.println("");
        System.out.println("Odaberite transakciju: ");
    }

    public static void goBack() {
        int back = 0;
        System.out.println("");
        System.out.println("0. Nazad");
        int goBack = scanner.nextInt();
        if (goBack == back) {
            mainWindow();
        }
    }

    public static boolean chose() {
        while (input == true) {
            int userSelectService = scanner.nextInt();
            if (userSelectService == 1) {
                System.out.println("Unesite uznos: ");
                int addMoneyToAccount = scanner.nextInt();
                amount += addMoneyToAccount;
                System.out.println("Vase stanje racuna je " + amount);
                goBack();
            }
            if (userSelectService == 2) {
                System.out.println("Unesite iznos2: ");
                int raisingMoney = scanner.nextInt();
                if (raisingMoney <= amount) {
                    amount -= raisingMoney;
                    System.out.println("Vase stanje racuna je: " + amount);
                } else {
                    System.out.println("Nemate dovoljno srestava!");
                }
                goBack();

            }
            if (userSelectService == 3) {
                System.out.println("Vase stanje racuna je: " + amount);
                goBack();
            }
            if(userSelectService == 4) {
                int oldPIN = 0;
                while (oldPIN != validatePIN && attemp <= 3) {
                    System.out.println("Molim vas da unesete stari PIN: ");
                    oldPIN = scanner.nextInt();
                    attemp++;
                    if (oldPIN == validatePIN) {
                        System.out.println("Molimo vas da unesete vas novi PIN: ");
                        int newPIN = scanner.nextInt();
                        validatePIN = newPIN;
                        System.out.println("Uspesno ste promenili PIN!" + validatePIN);
                        goBack();
                    } else {
                        System.out.println("Stari PIN nije dobar");
                        if (attemp > 3) {
                            System.out.println("Vasa karita je blokirana");
                            System.exit(1);
                        }
                    }
                }
            }
            if(userSelectService == 5){
                int userID = 0;
                while (userID != JMBG){
                    System.out.println("Unesite vas JMBG: ");
                    userID = scanner.nextInt();
                    if(userID == JMBG){
                        System.out.println("Postovani, vas kartica se nalazi u vasoj maticnoj filijali. Molim vas da je preuzmete.");
                        goBack();
                    }
                    else {
                        System.out.println("Korisnik sa tim ID-em ne postoji. Molim vas da unesete ispravan JMBG!");
                    }
                }
            }
        }
        return true;
    }
}
