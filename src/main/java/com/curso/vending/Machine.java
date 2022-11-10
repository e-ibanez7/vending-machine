/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vending;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eibaneza
 */
public class Machine {
    private ArrayList<Product> products;
    private double currentMoney;
    
    public Machine () {
        products = new ArrayList<Product>();
        currentMoney=0.0;
    }
    
    public void mainMenu (){
        System.out.println("**************************************************");
        System.out.println("************ Menu Principal Máquina **************");
        System.out.println("**************************************************");
        System.out.printf ("****************   Saldo actual:     %.2f 0**************** \n", this.currentMoney);
        System.out.println("0. Agregar Moneda");
        int counter = 1;
        for (Product product : this.products) {
            System.out.println(counter + ".Comprar " + product.getName() + "................" + product.getPrice() + " €");
            counter++;
        }
        System.out.println("Seleccione una opción:");
        Scanner input = new Scanner(System.in);
        int option = Integer.parseInt(input.nextLine());
        if (option == 0){
            this.menuMoney();
        }
        else {
           this.purchase(option);
        }
        
    }
    
    public void addProduct(String name, double price, int quantity){
        this.products.add(new Product(name, price, quantity));
    }
    
    public void menuMoney (){
        System.out.println("**************************************************");
        System.out.println("****************** Menu Monedas ******************");
        System.out.printf ("****************   Saldo actual:     %.2f 0**************** \n", this.currentMoney);
        System.out.println("0.  Salir");
        System.out.println("1......5 centimos");
        System.out.println("2......10 centimos");
        System.out.println("3......20 centimos");
        System.out.println("4......50 centimos");
        System.out.println("5......1 euro");
        System.out.println("6......2 euros");
        System.out.println("**************************************************");
        System.out.println("***************** Elija su opción ****************");
        Scanner input = new Scanner(System.in);
        int option = Integer.parseInt(input.nextLine());
        
        switch (option) {
            case 0 -> this.mainMenu();
            case 1 -> this.addMoney(0.05);
            case 2 -> this.addMoney(0.10);
            case 3 -> this.addMoney(0.20);
            case 4 -> this.addMoney(0.50);
            case 5 -> this.addMoney(1.0);
            case 6 -> this.addMoney(2.0);
        }
        this.menuMoney();
        
    }
    public void addMoney(double coin) {
        this.currentMoney = this.currentMoney + coin;
        if (coin < 1.0)
            System.out.println("Añadidos " + coin + " centimos");
        else
            System.out.println("Añadidos " + coin + " euros");
        
    }
    
    
    public void purchase (int product){
        double price = this.products.get(product-1).getPrice() ;
        if (price <= this.currentMoney){
            System.out.println(this.products.get(product-1).getName() + " comprado satisfactoriamente");
            this.currentMoney = this.currentMoney - price;
        }
        else 
            System.out.println("Dinero insuficiente. No se pudo realizar la compra de " + this.products.get(product-1).getName());
        this.mainMenu();
    }
}