import java.util.Scanner;

class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a Number: ");

  int num = scanner.nextInt();
  int sum = 0;

  for (int i = 0; i <= num; i++) {
   sum = sum = i;
  }
  System.out.println("The sum of all numbers from 0 to " + num + " is " + sum);

  // if(num>0) {
  // System.out.println("Number is Negative");
  // } else if (num<0){
  // System.out.println("Number is Positive");
  // } else {
  // System.out.println("Number is Zero");
  // }

 }
}