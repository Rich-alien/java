import java.io.*;
import java.nio.file.*;
import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        int count=0;
        int N=10;
        Scanner s=null;
        try {
            if (Files.exists(Paths.get("nums.txt"))) {
                Files.delete(Paths.get("nums.txt"));
                Files.createFile(Paths.get("nums.txt"));
            } else {
                Files.createFile(Paths.get("nums.txt"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Writer wr = new FileWriter("nums.txt");
            for (int i=0;i<N;i++) {
                wr.write((int) (Math.random() * 100) - 10 + "\n");
            }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            byte out1=0;
            s=new Scanner(new BufferedReader(new FileReader("nums.txt")));
            System.out.println("Byte: ");
            while (s.hasNext()){
                // System.out.println("byte");
                out1 =s.nextByte();
                System.out.print(out1+" ");
                count++;
            }
            System.out.println("Count byte: " + count);
            count=0;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            int out2=0;
            s = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            System.out.println("Int: ");
            while (s.hasNext()) {
                // System.out.println("Int");
                out2 = s.nextInt();
                System.out.print(out2 + " ");
                count++;
            }
            System.out.println("Count int: " + count);
            count=0;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            float out3=0;
            s = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            System.out.println("Float: ");
            while (s.hasNext()) {
                // System.out.println("Float");
                out3 = s.nextFloat();
                System.out.print(out3 + " ");
                count++;

            }
            System.out.println("Count float: " + count);
            count=0;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
