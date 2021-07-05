package com.xworkz.markerinterface.cloneable;

//By implementing Cloneable interface
//we make sure that instances of class Cover
//can be cloned.

public class Cover implements Cloneable {
    int size;
    String type;
  
    // A class constructor
    public Cover(int size,String type)
    {
        this.size = size;
        this.type = type;
    }
  
    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}