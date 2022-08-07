import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = obj.nextInt();
        obj.close();
        if(num < 0){
            System.out.println(String.format("%s is negative number",num));
            System.exit(0);
        }
        Factorial fact = new Factorial();
        System.out.println(String.format("Factorial of %s is %s",num,fact.evaluate(num)));
    }
}