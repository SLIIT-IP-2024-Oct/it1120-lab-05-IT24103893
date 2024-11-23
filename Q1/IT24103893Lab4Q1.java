import java.util.Scanner;
public class IT24103893Lab4Q1{
public static void main(String[] args){

Scanner num = new Scanner(System.in);
while (true) {
System.out.print("Enter a number:");
double number = num.nextDouble();

if (number < 0){System.out.print("The number is: Negative");}
else if (number > 0){System.out.println("The number is: Positive");}
else if (number == 0){System.out.println("The number is: Zero");}
System.out.println(" ");

}}}