import java.util.Scanner;

public class checkEvenOrOddNumber {
    public static void main(String[] args){
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number%2==0){
            System.out.println("number is even number");
        }else
            System.out.println("number is odd number");


    }
}
