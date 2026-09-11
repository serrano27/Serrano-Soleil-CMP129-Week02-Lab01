import java.util.Scanner;
public class KineticEnergy 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in); //for user input
        //vars to help calculate KE
        double mass, velocity, kE;
        //ask user for mass
        System.out.println("Enter the object's mass in kilograms: ");
        mass = keyboard.nextDouble();
        //ask user for velocity of object
        System.out.println("Enter the object's velocity in meters per second: ");
        velocity = keyboard.nextDouble();
        kE = kineticEnergy(mass, velocity);
        
        //display the kinetic energy
        System.out.printf("Kinetic Energy: %.2f",kE);
        

    }
    /*
        kineticEnergy() - accepts object's velocity & mass as parameters, calculates object's
        kinetic energy, return calculated KE as a double
    */
   public static double kineticEnergy(double m, double v) //m is mass, v is velocity
   {
        double kineticE = (.5)*m*Math.pow(v,2);
        return kineticE;
   }
}
