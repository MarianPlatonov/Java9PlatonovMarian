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

public class Car implements Saleable, Rentable{

    static Color Color;

 
 
 /**
 @enum enumeration of accepted car colors
 */
 public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
 /**
 Internal hidden fields / attributes
 */
 private Color color;
 private String name;
 private int speed;
 private int dailyRentPrice;
 private int salePrice;
 /**
 Constructors
 */
 public Car(){
 name = "Default car name";
 speed = 90;
 }
 public Car(String carName, Color carColor, int carSpeed,  int carSalePrice, int carDailyRentPrice){
 name = carName;
 speed =  carSpeed;
 color = carColor;
 salePrice=carSalePrice;
 dailyRentPrice=carDailyRentPrice;
 }
 /*get-ers and set-ers*/
 public String getName(){
 return(name);
 }
 public Color getColor(){
 return(color);
 }
 public int getSpeed(){
 return(speed);
 }
 public void setName(String newName){
 name = newName;
 }
 public void setColor(Color newColor){
 color = newColor;
 }
 public void setSpeed(int newSpeed){
 speed =  newSpeed;
 }
  
public void setSalePrice(int newSalePrice){
 salePrice =  salePrice+newSalePrice;
 }

public void setDailyRentPrice(int newDailyRentPrice){
 dailyRentPrice =  dailyRentPrice+newDailyRentPrice;
 }
 /**
 The method increase actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void increaseSpeed(int newSpeed){
  speed=speed+newSpeed;
 //if(newSpeed > speed){
 //speed =  newSpeed;
// }
// else if (newSpeed < speed){
// decreaseSpeed(newSpeed);
 //}
 }
 /**
 The method decrease actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void decreaseSpeed(int newSpeed){
     speed=speed-newSpeed;
 //if(newSpeed < speed){
 //speed = newSpeed;
 //}
 //else if (newSpeed < speed){
 //increaseSpeed(newSpeed);
 //}
 }
 /**
 Abstract method defined in Saleable interface implemented by class car
 * is implemented here.
 * @override Saleable.getSalePrice() method
 */
 @Override
 public int getSalePrice(){
 return(salePrice);
 }
 /**
 Abstract method defined in Rentable interface implemented by class car
 * is implemented here.
 * @override Rentable.getDailyRentPrice() method
 */
 @Override
 public int getDailyRentPrice(){
 return(dailyRentPrice);
 }

 
}