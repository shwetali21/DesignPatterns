package com.java.designpattern.structural.facade;

public class Client { 
    public static void main (String[] args) { 
        HotelKeeper keeper = new HotelKeeper(); 
          
        VegMenu v = keeper.getVegMenu(); 
        NonVegMenu nv = keeper.getNonVegMenu(); 
  
        System.out.println(v.toString());
        System.out.println(nv.toString());
    } 
} 