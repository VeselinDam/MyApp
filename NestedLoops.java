package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class NestedLoops {

    //static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        duplicate('D');
        reverse("veka");
        //countDown();

    }

    public static void duplicate(char slovo){
        char[] duplikat = {'C','B', 'C', 'D', 'D'};
        for (char a:duplikat) {
            if(a == slovo){
                System.out.println(a);
            }
        }
    }

    public static void reverse(String slovo){
        String reverse = "";
        for(int i = slovo.length()-1; i>=0; i--){
            reverse += slovo.charAt(i);
        }
        System.out.println(reverse);
    }






}
