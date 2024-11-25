// Conditional statement
// 

// Write a java programme to make calculator

import java.util.Scanner;
class Calculator {

public static void main(String args [ ] ) {

char c;
int n1 , n2;

Scanner sc = new Scanner(System.in);

System.out.println("ENTER YOUR CHOICE: ");
System.out.println(" Press + for Addition");
System.out.println("Press - for Subtraction");
System.out.println("Press * for Multiplication");
System.out.println("Press /  for Division");
System.out.println("===============================");
 
c = sc.next.charAt(0);

System.out.println("===============================");

System.out.println("Enter number 1: ");
n1 = sc.nextInt();

System.out.println("Enter number 2: ");
n2 = sc.nextInt();

if ( c == '+'){
System.out.println("Addition: " + ( n1 + n2));
} 
else if( c== '-'){
System.out.println("Subtraction: " + ( n1 - n2));
}
else if( c == '*'){
System.out.println("Multiplication: " + ( n1 * n2));
}
else if( c == '/'){
System.out.println("Division: " ( n1 / n2));
}
else{
System.out.println("Invalid Choice")
}

}


