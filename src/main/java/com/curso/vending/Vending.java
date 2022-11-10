/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.vending;

/**
 *
 * @author eibaneza
 */
public class Vending {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Machine m = new Machine ();
        m.addProduct("Wumpas", 2.25, 0);
        m.addProduct("Plumbus", 1.33, 7);
        
        m.mainMenu();
    }
}
