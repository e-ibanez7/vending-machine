/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vending;

/**
 *
 * @author eibaneza
 */
public class Product {
    private String name;
    private double price;
    private int avaiable;
    
    public Product (String name, double price, int avaiable){
        this.name = name;
        this.price = price;
        this.avaiable = avaiable;
    }
    
    public String getName (){
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getAvaiability(){
        return this.avaiable;
    }
    
    
    public void addAvaiability(int quantity){
        this.avaiable += quantity;
    }
}
