
   import java.util.ArrayList;
   import java.util.Collections;
   import java.util.Scanner;

public class sredmax {
 
  
        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            int FirstEl = sc.nextInt();
            int MiddleEl = sc.nextInt();
            int SecondEl = sc.nextInt();
            sc.close();
            System.out.println("Введено числа:" +" "+ FirstEl+" " + MiddleEl+" "  + SecondEl );
    
            int SrAr = (FirstEl+MiddleEl +SecondEl )/3;
            System.out.println("Среднее арифметическое = " + SrAr);
    
    
            ArrayList list = new ArrayList<>();
            list.add(FirstEl);
            list.add(MiddleEl);
            list.add(SecondEl);
            System.out.println("Максимальное введенное число = "+ Collections.max(list));
        }
    }
