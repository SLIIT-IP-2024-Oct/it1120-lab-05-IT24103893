import java.util.Scanner;
public class IT24103893Lab4Q2 {
public static void main (String[] args){

     Scanner marks = new Scanner (System.in);
while (true)  {

 System.out.print("Please enter exam marks (out of 100):");
double exammarks = marks.nextDouble();
if (exammarks > 100){System.out.print("Invalid input for exam marks. Terminating Program.");
System.exit(0);}

 System.out.print("Please enter the lab submission marks (out of 100):");
double labmarks = marks.nextDouble();
if (labmarks > 100){System.out.println("Invalid input for lab submissoin marks. Terminating Program");
System.exit(0);}

 System.out.print("Please enter the percentage given for the exam:");
int examprecentage = marks.nextInt();
 System.out.print("Please enter the percentage given for the lab submission:");
int labprecentage = marks.nextInt();
if ((examprecentage+labprecentage) > 100){System.out.print("The precentages must add up to 100. Terminating program.");
System.exit(0);}

double exammarks1 = (exammarks*examprecentage)/100;
double labmarks1 = (labmarks*labprecentage)/100;
double finalexammarks = (exammarks1+labmarks1);

System.out.println(" ");
 System.out.println("Final Exam Mark is:" +finalexammarks);
  System.out.println(" ");

  }
 }
        }