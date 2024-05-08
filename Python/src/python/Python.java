/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package python;

import java.util.Scanner;

/**
 *
 * @author makoal
 */
public class Python {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.next();
        System.out.println("Your Name is "+Move(name));
        System.out.println("Testing");
        
    }
    public static String Move(String name)
    {
        return name;
    }
}
