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

        for (int i=0; i<end; i++){
            int randomNum = random.nextInt(min, max);
            Thread.sleep(500);
                if(user <= end){
                    user += randomNum;
                    System.out.println(user);
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
