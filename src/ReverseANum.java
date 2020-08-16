import java.util.Scanner;

public class ReverseANum {

    public static void main(String[] args) {
        modulo();
        recursion();
    }

    public static void modulo(){
        int number=0;
        int revNumber = 0;
        System.out.println("Input your number: ");
        //capture user input
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while(number != 0){
            revNumber = revNumber * 10;
            revNumber = revNumber + number % 10;
            number = number / 10;

        }
        System.out.println("reverse number is:" +revNumber);
    }

    public static void recursion(){
        int num = 0;
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Reverse number is:");
        useRecursion(num);
    }

    public static void useRecursion(int number){
        if(number < 10)
        {
            System.out.print(number);
        }
        else
        {
            System.out.print(number%10);
            useRecursion(number/10);
        }
    }

}
