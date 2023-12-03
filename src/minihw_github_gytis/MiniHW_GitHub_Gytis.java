/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihw_github_gytis;

/**
 *
 * @author Gytis
 */
public class MiniHW_GitHub_Gytis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car car1 = new Car("Ford", "Focus", 4, "Silver", 120);
        car1.drive("forward");
        
        Car car2 = new Car("Honda", "Accord", 4, "Black");
        car2.drive("sideways");
        
        Car car3 = new Car();
        car3.drive("backwards");
    }
    
}
