package test;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortArrays {
    public static void main(String[] args) {
        niz();
    }
    public static void niz(){
        int[] nizovi = {2,4,5,8,44,-55,24};
        Arrays.toString(nizovi);
        Arrays.sort(nizovi);
        for(int i = 1; i <= nizovi.length; i++){
            for(int j = 0; j < i; j++){
                System.out.print(nizovi[j]+" ,");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--){
            for(int k = 0; k < i; k++){
                System.out.print(nizovi[k] + " ,");
            }
            System.out.println();
        }
    }
}
