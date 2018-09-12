/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;


/**
 *
 * @author Marian
 */
public class Autoservice extends Car {

   

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
       
     displayAutoservice();

     
    }

    /**
     *
     */
    private static  void displayAutoservice(){
      // int i=0;
      
       Car Car1 = new Car("Chevrolet Camaro",Color.RED,250,42000,350); //New instance named Car1 that has the parameters (String carName, Color carColor,int carSpeed,int carSalePrice, int carDailyRentPrice)
       Car Car2 = new Car("Ford Escort",Color.BLACK,220,36000,300);
       Car Car3 = new Car("Ferrari Enzo",Color.GRAY,220,120000,500);
             
      //Another way to make an instance and to set its parameters
      //Car1.setName("Mustang");
      // Car1.setColor(Color.RED);
      //Car1.setSpeed(120);
      // Car1.setSalePrice(24000);
      // Car1.setDailyRentPrice(350);
      System.out.println("Car name: "+Car1.getName()+"\nCar color: "+Car1.getColor()+"\nCar speed: "+Car1.getSpeed()+" km/h"+"\nCar sale price: "+Car1.getSalePrice()+"$"+"\nCar daily renting price: "+Car1.getDailyRentPrice()+"$");
      System.out.println("-----------------------------------");
      System.out.println("Car name: "+Car2.getName()+"\nCar color: "+Car2.getColor()+"\nCar speed: "+Car2.getSpeed()+" km/h"+"\nCar sale price: "+Car2.getSalePrice()+"$"+"\nCar daily renting price: "+Car2.getDailyRentPrice()+"$");
      System.out.println("-----------------------------------");
      System.out.println("Car name: "+Car3.getName()+"\nCar color: "+Car3.getColor()+"\nCar speed: "+Car3.getSpeed()+" km/h"+"\nCar sale price: "+Car3.getSalePrice()+"$"+"\nCar daily renting price: "+Car3.getDailyRentPrice()+"$");
    Car1.increaseSpeed(10);
    Car2.decreaseSpeed(10);
    Car3.setDailyRentPrice(15);
    Car3.setSalePrice(-1200);
      System.out.println("\n!The car list was updated  on 21.09.2018 at 22:05\n");
      System.out.println("Car name: "+Car1.getName()+"\nCar color: "+Car1.getColor()+"\nCar speed: "+Car1.getSpeed()+" km/h"+"\nCar sale price: "+Car1.getSalePrice()+"$"+"\nCar daily renting price: "+Car1.getDailyRentPrice()+"$");
      System.out.println("-----------------------------------");
      System.out.println("Car name: "+Car2.getName()+"\nCar color: "+Car2.getColor()+"\nCar speed: "+Car2.getSpeed()+" km/h"+"\nCar sale price: "+Car2.getSalePrice()+"$"+"\nCar daily renting price: "+Car2.getDailyRentPrice()+"$");
      System.out.println("-----------------------------------");
      System.out.println("Car name: "+Car3.getName()+"\nCar color: "+Car3.getColor()+"\nCar speed: "+Car3.getSpeed()+" km/h"+"\nCar sale price: "+Car3.getSalePrice()+"$"+"\nCar daily renting price: "+Car3.getDailyRentPrice()+"$");
    
    
       

    } 
   }

  

