package com.company;

 class Vehicle{
    int maxSpeed;
    private String color;
    protected int wheel;

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public void print(){
        System.out.println("Vehicle Speed " + maxSpeed + " Color " + getColor());
    }
}
  class  Car extends Vehicle{
     int noOfDoor;
//     This is call function overriding
      public void print(){
          System.out.println("Vehicle Speed " + maxSpeed + " Color " + getColor() + " no of doors are " + noOfDoor);
      }
     }
   class Bicycle extends Vehicle{

   }
public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setColor("Blue");
        v.print();

        Car c = new Car();
        c.print();

        Bicycle b = new Bicycle();
        b.print();
    }
}
