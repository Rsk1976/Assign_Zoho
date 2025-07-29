import java.util.Scanner;
public class ex{
public static void main (String [] ar){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String Name1 = sc.nextLine();
System.out.println("Enter your name:");
String Name2 = sc.nextLine();
System.out.println("Enter your dept:");
String Dept1 = sc.nextLine();
System.out.println("Enter your dept:");
String Dept2 = sc.nextLine();
System.out.println("Enter your year:");
int year1 = sc.nextInt();
System.out.println("Enter your year:");
int year2 = sc.nextInt();
System.out.println("Enter your gpa:");
double gpa1 = sc.nextDouble();
System.out.println("Enter your gpa:");
double gpa2 = sc.nextDouble();
sc.nextLine();
System.out.println("Enter your age:");
String age1 = sc.nextLine();
System.out.println("Enter your age:");
String age2 = sc.nextLine();
 if (gpa1>gpa2){
	System.out.println("you've scored more marks:"+ Name1 + Dept1 + gpa1 + age1);
  }
 else{
	System.out.println("you've scored less marks:"+ Name2 + Dept2 + gpa2 + age2); 
 
 }
}
}
