package week1;

import java.util.Calendar;

public class Car {
    //instance variables
    String make;
    String model;
    int year;
    boolean isNew;
    double miles;
    String owner;
        
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Audi";
        myCar.model = "A4";
        myCar.year = 2014;
        myCar.miles = 0;
        myCar.isNew = true;
        myCar.owner = "Oganes";
        boolean isMyCarOld = myCar.isOld();
        myCar.sell("Rock");
        System.out.println("Car owned by " + myCar.owner);
    }
    
    public void sell(String newOwner) {
        owner = newOwner;
        if (isNew) {
            isNew = false;
        }
    }
    
    public boolean isOld(){
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        if (thisYear -year > 10) {
            return true;
        }
        else {
            return false;
        }
    }

}


