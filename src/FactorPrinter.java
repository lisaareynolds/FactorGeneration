import java.util.Scanner;
public class FactorPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the integer you would like to factor: ");
        int userInt;
        while(!in.hasNextInt()){
            System.out.println("Sorry, that's not a valid input. Try again: ");
        }
        userInt = in.nextInt();
        FactorGenerator generator = new FactorGenerator(userInt);
        String factorList = "";
        while(generator.hasMoreFactors()){
            factorList += (generator.nextFactor() + " ");
        }
        System.out.println("The factors of this integer are " + factorList);
    }
}
