import java.nio.file.*;
import java.io.*;

public class lab1 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get(".").toAbsolutePath();
        System.out.println("Current catalog: " + p1.toString());
        Path p2 = Paths.get(p1.toString().substring(0, p1.toString().length() - 1)).getFileName();
        System.out.println("File name: " + p2.toString());
        Path p3 = Paths.get(p1.toString().substring(0, p1.toString().length() - 1) + "src\\com\\company\\Main.java");
        System.out.println("File name java: " + p3.getFileName().toString());
        if (Files.isReadable(p3)) {
            try (BufferedReader br = Files.newBufferedReader(p3)) {
                System.out.println("File Contents " + p3.toString());
                while (br.ready()) {
                    System.out.println(br.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else  System.out.println("Fail " + p3.toString() + " illegible");
        
    }
}
