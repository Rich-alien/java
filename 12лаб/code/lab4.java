import java.io.*;
import java.nio.file.*;
import java.util.*;
public class lab4 {
    public static void main(String[] args) {
        int N=10;
        try {
            if (Files.exists(Paths.get("nums.txt"))) {
                Files.delete(Paths.get("nums.txt"));
                Files.createFile(Paths.get("nums.txt"));
            } else Files.createFile(Paths.get("nums.txt"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Writer wr = new FileWriter("nums.txt");
            for (int i=0;i<N;i++) {
                wr.write((int) (Math.random() * 20) - 10 + "\n");
            }
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner s = new Scanner(new File("nums.txt"))){
            int k=0;
            int sr=0;
            int[] arr = new int[N];
            while (s.hasNextInt()){
                arr[k] =s.nextInt();
                k++;
            }
            k=0;
            for (int i=N/2; i<N;i++){
                sr += arr[i];
                k++;
            }
            sr/=k;
            System.out.println("Middle second half: " + sr);
            k=0;
            sr=0;
            for (int i=N/2; i<N*3/4;i++){
                sr += arr[i];
                k++;
            }
            sr/=k;
            System.out.println("Middle third quarter: " + sr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
