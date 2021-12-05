package test;

import java.util.Scanner;

public class countDown {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO GO GO GO");
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.next();
        long startTime = System.currentTimeMillis();
        String prezime = scanner.next();
        long endTime = System.currentTimeMillis();
        long time = startTime - endTime;
        System.out.println("Razlika izmedju prvo unosa podataka i drugog je: ");
        System.out.println(time);




    }
}
