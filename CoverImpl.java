package com.xworkz.markerinterface.cloneable;

public class CoverImpl {
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	Cover cover1 = new Cover(20, "Envelope");
    	System.out.println("size: "+cover1.size +", type: "+ cover1.type);
    	System.out.println(cover1.hashCode());
        // cloning 'cover1' and holding
        // new cloned object reference in cover2
  
        // down-casting as clone() return type is Object
    	Cover cover2 = (Cover)cover1.clone();
  
        System.out.println("size: "+cover2.size +", type: "+ cover2.type);
        System.out.println(cover2.hashCode());
    }
}