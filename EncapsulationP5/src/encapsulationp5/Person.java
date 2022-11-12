/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationp5;

/**
 *
 * @author febri
 */
public class Person {
    String name;
    String address;
    
    Person(String name, String address){
        String paramName = this.name;
        String paramAddress = this.address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        return 
        "Nama   = " + this.name + 
        "\nAlamat   = " + this.address;
    } 
}
