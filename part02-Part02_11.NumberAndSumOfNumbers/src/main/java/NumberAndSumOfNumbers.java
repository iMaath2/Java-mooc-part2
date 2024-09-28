
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0 ) {
                break;
            }
            
            if (number != 0 ) {
                cont ++;
                sum += number;
                continue;
            }
            
        }
        System.out.println("Number of numbers: " + cont);
        System.out.println("Sum of the numbers: " + sum);
    }
}

