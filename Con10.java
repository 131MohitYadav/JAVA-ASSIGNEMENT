// Conditional Statement
// nested if 

 // Write a java programe to check given character is Uppercase , Lowercase without  //using logical operator and without using built in function only using nested if else

import java.util.Scanner;

class Con10{

public static void main (String args [ ]  ) {

Scanner sc = new Scanner(System.in);

char c;

System.out.print("Enter any character: ");
c = sc.next().charAt(0);

if ( c >= 'a'){
	if ( c <= 'z'){
		System.out.println("Lower Case");
}
}
else if ( c >= 'A'){
	if(c <= 'Z'){
System.out.println("Upper Case");
}
}

}
}
