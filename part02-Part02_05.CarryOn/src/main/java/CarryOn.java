
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String a = "a";
        
        while (!a.equals("no")){
            System.out.println("Shall we carry on?");
            a = scanner.nextLine();
        }
        
    }
}
