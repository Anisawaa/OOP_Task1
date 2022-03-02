/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1_temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author Nisa
 */
public class Main
{
    public static void main(String[] args)
    {
        int menu;
        double Celcius;
        Conversion conv = new Conversion();
        
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        
        do
        {
            System.out.println();
            System.out.println("Data Entry");
            System.out.println("----------");
            Scanner input = new Scanner(System.in);

            System.out.print("Temperature in Celcius : ");
            Celcius = input.nextInt();
            
            do
            {
                System.out.println();
                System.out.println("Option");
                System.out.println("------");
                System.out.println("1. View Conversion Data");
                System.out.println("2. Edit Conversion Data");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                menu = input.nextInt();

                if(menu == 1)
                {
                    System.out.println("Temperature In Celcius : " + Celcius + "°C");
                    System.out.println("In Fahrenheit : " + conv.Fahrenheit(Celcius) + "°F");
                    System.out.println("In Reamur : " + conv.Reamur(Celcius) + "°R");
                    System.out.println("In Kelvin : " + conv.Kelvin(Celcius) + "°K");
                    
                    System.out.print("Water Condition ");
                    conv.Status(Celcius);
                    System.out.print(".");
                    System.out.println();
                }
                
                else if(menu != 2 && menu != 3)
                {
                    System.out.println();
                    System.out.println("Option does not exist. Please enter the options correctly!");
                }
            }
            while(menu == 1 || menu != 2 && menu != 3);
        }
        while(menu == 2 || menu != 3);
    }
}
