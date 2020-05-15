import java.io.*;
import java.nio.file.*;
import java.util.*;
public class lab2 {
    public static void main(String[] args) {

        try {
            if (Files.exists(Paths.get("nums.txt"))) {
                Files.delete(Paths.get("nums.txt"));
                Files.createFile(Paths.get("nums.txt"));
            } else Files.createFile(Paths.get("nums.txt")); 
        } catch (IOException e) {
            e.printStackTrace(); }
        try {
            Writer wr = new FileWriter("nums.txt");
            for (int i=0;i<10;i++) {
                wr.write((int) (Math.random() * 20) - 10 + "\n"); }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace(); }
        try (Scanner s = new Scanner(new File("nums.txt"))){
            int k=1;
            int sum=0;
            while (s.hasNextInt()){
                sum =sum+ s.nextInt();
                int sr=sum/k;
                System.out.println("Average by " + k + " iterations: "+sr);
                k++; }
        } catch (IOException e) {
            e.printStackTrace(); }
    }
}
