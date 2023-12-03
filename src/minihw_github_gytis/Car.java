/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minihw_github_gytis;

/**
 *
 * @author Gytis
 */
public class Car {
    
    String make;
    String model;
    int numOfWheels;
    String colour;
    int speed;
        
        public Car(String make, String model, int numOfWheels, String colour, int speed) {
            
            this.make = make;
            this.model = model;
            this.numOfWheels = numOfWheels;
            this.colour = colour;
            this.speed = speed;
    
        }
        
        public void drive(String direction) {
        System.out.println("The " + colour + " " + make + " " + model + " on " + numOfWheels + " wheels is driving " + direction + " @" + speed + " km/h");
        }
}
