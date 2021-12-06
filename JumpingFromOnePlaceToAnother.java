package test;

import java.util.Random;

public class JumpingFromOnePlaceToAnother {

    public static void main(String[] args) throws InterruptedException {
        number();
    }

    public static void number() throws InterruptedException {
        Random random = new Random();
        int start = 0;
        int attempt = 0;
        int user = 0;
        int prison = 15;
        int end = 30;
        int min = 1;
        int max = 6;
        int tax = 1001;
        int chance1 = 2;
        int chance2 = 13;
        int suprise1 = 7;
        int suprise2 = 18;
        int amount = 2000;

        for (int i=0; i<end; i++){
            int randomNum = random.nextInt(min, max);
            Thread.sleep(500);
                if(user <= end){
                    user += randomNum;
                    System.out.println(user);
                    if(user == chance1){
                        System.out.println("Dobili ste sansu: Idite 2 polja unapred!");
                        user += 2;
                        if(user == 4){
                            if(amount > tax){
                                System.out.println("Morate platiti 1000$ poreza!");
                                amount -= tax;
                                System.out.println("Vas budzet je "+amount+"$");
                            }
                            else {
                                System.out.println("Nemate dovoljno para, izgubili ste.");
                                break;
                            }
                        }
                    }
                    if(user == suprise1){
                        System.out.println("Dobili ste iznenadjenje: Idite do cilja.");
                        user = end;
                        System.out.println("Bravo pobedili ste");
                        break;
                    }
                    if(user == chance2){
                        System.out.println("Dobili ste sansu: Idite 2 polja unapred!");
                        user += 2;
                    }
                    if(user == suprise2){
                        System.out.println("Dobili ste iznenadjenje: Vratite se 2 polja unazad.");
                        user -= 3;
                    }
                    if(user == prison){
                        System.out.println("Idete u zatvor. Morate 5-icu da dobijete da bi ste izasli");

                        while (user == prison){
                            int ESC = 5;
                            int escRandomNum = random.nextInt(min, max);
                            Thread.sleep(500);
                            if(ESC == escRandomNum){
                                System.out.println("Bravo ! ! ! Izasli ste iz zatvora");
                                break;
                            }

                        else{
                                System.out.println(escRandomNum);
                                if(attempt < 2){
                                    System.out.println("Niste dobili 5-icu");
                                    attempt++;
                                }
                                else {
                                    user = start;
                                    attempt = 0;
                                    System.out.println("Vracate se na start!");
                                    break;
                                }
                            }
                        }
                    }

                }
                else {
                    System.out.println("Stigli ste do cilja");
                    break;
                }
        }

    }
}
