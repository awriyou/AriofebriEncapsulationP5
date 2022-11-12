/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationp5;

import java.util.Scanner;

/**
 *
 * @author febri
 */
public class EncapsulationP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, address;
        Scanner in = new Scanner(System.in);
        Person person = new Person("", "");
        
        System.out.print("Nama    : ");
        person.name = in.nextLine();
        
        System.out.print("Alamat  : ");
        person.address = in.nextLine();
        
        String printSemua = person.toString();
        System.out.println(printSemua);
        
        
    }
    
}
