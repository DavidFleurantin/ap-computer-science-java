 
import javax.swing.JOptionPane;
/**
 This class implements the Newton-Raphson method to approximate the
 root of an input value
*/
 class RootApproximator
{
 /**
 Creates a RootApproximator object used to
 approximate the root answer of a number
 @param anA the input value
 @param aN the root number extracted
 */
 public RootApproximator(double anA, int aN)
 {
 a = anA;
 n = aN;
 xold = 1;
 xnew = a;
 }
 /**
 Method used to calculate the next root number
 @return the next guess number
 */
 public double nextGuess()
 {
 xold = xnew;
 xnew = xold * (1 - 1.0 / n) + a / (n * Math.pow(xold, n - 1));
 return xnew;
 }
 /**
 Determine if there are more guesses
 @return true we are close enough to the answer
 */
 public boolean hasMoreGuesses()
 {
 final double EPS = 0.000001;
 return (Math.abs(xnew - xold) > EPS);
 }
 private double a;
 private int n;
 private double xold;
 private double xnew;
}


/**
 Test class for RootApproximator class
*/
public class LabP712
{
 public static void main(String[] args)
 {
 String input = JOptionPane.showInputDialog(
 "Please enter a number:");
 double a = Double.parseDouble(input);
 input = JOptionPane.showInputDialog(
 "Extract which root?");
 int n = Integer.parseInt(input);
 RootApproximator r = new RootApproximator(a, n);
 while (r.hasMoreGuesses())
 System.out.println(r.nextGuess());
 System.exit(0);
 }
}