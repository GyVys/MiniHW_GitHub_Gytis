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
        
        public Car(String make, String model, int numOfWheels, String colour) {
            
            this.make = make;
            this.model = model;
            this.numOfWheels = numOfWheels;
            this.colour = colour;
    
        }
        
        public Car() {
            
        make = "BMW";
        model = "520d";
        numOfWheels = 4;
        colour = "green";
    }
        
        public void drive(String direction) {
        System.out.println("The " + colour + " " + make + " " + model + " is driving " + direction);
        }
}
