package test;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortArrays {
    public static void main(String[] args) {
//        int[] random = { 33, 22, 11, 21, 55, 32, 3, 4 };
//        System.out.println("Array before sorting : " + Arrays.toString(random));
//        Arrays.sort(random);
//        System.out.println("Array after sorting in ascending order : " + Arrays.toString(random));
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
