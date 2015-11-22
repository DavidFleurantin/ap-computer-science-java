
// Programmer: David Fleurantin
// Date: September 17, 2014

public class LabP210 {
 
 public static void main(String[]args)
 {
 String originalString = "Hello World!";

char[] e = originalString.toCharArray();

// Replace with a "swap" function, if desired:
char temp = e[0];
e[0] = e[1];
e[1] = temp;

String swappedString = new String(e);

System.out.println(originalString);
System.out.println(swappedString);
 }

}
