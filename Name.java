import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class Name{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("name.txt");
        PrintWriter write = new PrintWriter(file);
        write.println((new Scanner(System.in)).next());
        write.close();
        System.out.println((new Scanner(file)).nextLine());
    }
}
