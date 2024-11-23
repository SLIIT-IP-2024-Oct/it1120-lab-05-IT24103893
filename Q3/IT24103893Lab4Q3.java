import java.util.Scanner;
 public class IT24103893Lab4Q3 {
 public static void main(String[] args) {

       Scanner num = new Scanner(System.in);
while (true) {
 System.out.print("Enter a number:");
double number = num.nextDouble();

String Positive, Negative, Zero ;
String result = (number > 0) ?  "Positive" : 
                (number < 0) ?  "negative" :
                                "Zero" ;
System.out.println("The number is:" +result);
System.out.println(" ");

}}}