

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        
        sumOfTwoNo();
        
    }
static void sumOfTwoNo(){
    Scanner in=new Scanner(System.in);
   
    System.out.println("Enter first Number");
    int a=in.nextInt();
    System.out.println("Enter Second Number");

    int b=in.nextInt();
    int sum=a+b;
    //if i use return in this line the function over and code below return will be unreachable
    System.out.println("The Sum "+sum);

}
}
