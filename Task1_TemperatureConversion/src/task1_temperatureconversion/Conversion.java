/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1_temperatureconversion;

/**
 *
 * @author Nisa
 */
public class Conversion
{
    public double Fahrenheit(double Celcius)
    {
        double F = (9 * Celcius )/5 + 32;   
        return F;
    }
    
    public double Reamur(double Celcius)
    {
        double R = (4 * Celcius)/5;
        return R;
    }
    
    public double Kelvin(double Celcius)
    {
        double K = (Celcius + 273.15);
        return K;
    }
    
    public void Status(double Celcius)
    {
        //status : Freeze
        if(Celcius <= 0)
        {
            System.out.print("Frozen");
        }
        
        //status : Boiling
        else if(Celcius >= 100)
        {
            System.out.print("Boiling");
        }
        
        //status : Normal
        else
        {
            System.out.print("Normal");
        }
    }
}
