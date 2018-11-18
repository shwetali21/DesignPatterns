package com.java.designpattern.structural.facade;

public class HotelKeeper { 
    public VegMenu getVegMenu() { 
        VegRestaurant v = new VegRestaurant(); 
        VegMenu vegMenu = (VegMenu)v.getMenus(); 
        return vegMenu; 
    } 
      
    public NonVegMenu getNonVegMenu() { 
        NonVegRestaurant v = new NonVegRestaurant(); 
        NonVegMenu nonVegMenu = (NonVegMenu)v.getMenus(); 
        return nonVegMenu; 
    } 
} 
