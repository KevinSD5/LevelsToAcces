package com.claseufpso.acces;

import people.Persona;

public class Acces {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.sayHello();
    
        Persona Persona = new Persona ("Juan", 25);
        System.out.println(Persona.getAge());
        
    }
    
}
