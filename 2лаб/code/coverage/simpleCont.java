package coverage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class simpleCont {
    public static void main (String [] args) {     
        int[] a = new int[100];
        int K = 100;
        for (int i = 0; i < K; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(a);

        for (int i = 0; i < K; i++) {
            System.out.println(a[i]);
        }
        int ab = 0;
        for (int i = 0; i < K; i++) {
            if (a[i] % 3 == 0) {
                ab++;
            }
        }
        System.out.println("Количество чисел кратных 3 = " + ab);

        int abc = 0;
        for (int i=0; i < a.length; i++)
        {
            for (int j=2; j <= a.length; j++)
            {
                if (a[i]%j == 0 && a[i] != j)
                {
                    abc++;
                    break;
                }
            }

        }
        System.out.println("Количество простых чисел = " + abc);
    } 
}