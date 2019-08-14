

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
    int a, b, sum, subtract;
    Scanner give = new Scanner(System.in);

    System.out.println("Write a number");
    a = give.nextInt();
    System.out.println("Write a second number");
    b= give.nextInt();
    sum = a+b;
    System.out.println("a+b=" + sum);
    subtract = a-b;
    System.out.println("a-b="+ subtract);
    }

}
