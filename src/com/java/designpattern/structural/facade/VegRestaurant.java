package com.java.designpattern.structural.facade;

public class VegRestaurant implements Hotel { 
    public Menus getMenus() { 
      return new VegMenu(); 
    } 
} 
