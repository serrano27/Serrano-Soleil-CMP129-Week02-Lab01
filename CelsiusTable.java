/*
Name: Soleil Serrano
Course #: 80231
Week: 2
Lab: 1
Date: 9/11/2026
*/
public class CelsiusTable 
{
    public static void main(String [] args)
    {
        //equation for celsius - C = (5/9) * (F - 32)
        double Celsius;
        //display
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("------------------------");
        //for loop for display
        for (int f = 0; f <= 20; f++)
        {
            Celsius = celsius(f);
            System.out.printf("%d\t\t%.2f",f,Celsius);
            System.out.println();
        }

    }

    /*
        celsius() - accept a Fahrenheit temp as parameter, convert temp to Celsius, return
        Celsius temp as double
     */
    public static double celsius(double f) //f is Fahrenheit
    {
        double C = (0.5556) * (f-32); //C is celsius
        return C;
    }
}
