  /**
   This class simulates a cannonball fired up in the air.
*/

import javax.swing.JOptionPane; 
 
 class CannonBall
{ 
	 // Initial Velocity, Position, and G force
	 private double ivel;
	 private double pos;
	 private static final double G = 9.81;
   /**
      Creates a CannonBall Object
      @param aIvel 
   */
   public CannonBall(double aIvel)
   {
      ivel = aIvel;
      pos = 0;
   }

   /**
      Compute velocity of the cannonball.
      @param deltaT the time interval
   */
   public void move(double deltaT)
   {
      pos = pos + ivel * deltaT;
      ivel = ivel - G * deltaT;
   }

   /**
      Get velocity
      @return the velocity
   */
   public double getVelocity()
   {
      return ivel;
   }

   /**
      Get position 
      @return the position
   */
   public double getPosition()
   {
      return pos;
   }

  

  
}
 

 /**
    Test Class
 */
 public class LabP73
 {
    public static void main(String[] args)
    {
        
       
    	String userIvel = JOptionPane.showInputDialog ( null, "Enter a value for the initial velocity:");
       double ivel = Double.parseDouble(userIvel);

       final double G = 9.81;
       double deltaT = 0.01;
       double t = 0;
       double exactFormulaPos = 0;
       double vel = ivel;

       CannonBall userCannonBall = new CannonBall(ivel);

       while (vel > 0)
       {
          for (int i = 0; vel > 0 && i < 100; i++)
          {
             userCannonBall.move(deltaT);
             t = t + deltaT;
             vel = userCannonBall.getVelocity();
          }

          exactFormulaPos = -0.5 * G * t * t + ivel * t;

          JOptionPane.showMessageDialog ( null, "Simulation position: " + userCannonBall.getPosition() + "m"
             + " Velocity: " + userCannonBall.getVelocity() + "m/s");
          JOptionPane.showMessageDialog ( null,"The exact formula position is: " + exactFormulaPos + "m");
       }
    }
 }