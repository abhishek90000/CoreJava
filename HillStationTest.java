package com.ajp_day4;

// Superclass
class HillStations {
    // Method to be overridden
    public void location() {
        System.out.println("Hill station location");
    }

    // Method to be overridden
    public void famousFor() {
        System.out.println("Famous for its natural beauty");
    }
}

// Subclass 1
class Manali extends HillStations {
    // Overriding the location method
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }

    // Overriding the famousFor method
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
    }
}

// Subclass 2
class Mussoorie extends HillStations {
    // Overriding the location method
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }

    // Overriding the famousFor method
    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its picturesque landscape and pleasant weather.");
    }
}

// Subclass 3
class Gulmarg extends HillStations {
    // Overriding the location method
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir, India.");
    }

    // Overriding the famousFor method
    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and winter sports.");
    }
}

// Main class to demonstrate polymorphism
public class HillStationTest {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Calling location() and famousFor() using parent class reference
        System.out.println("Using parent class reference (HillStations):");

        // Manali
        manali.location();
        manali.famousFor();

        // Mussoorie
        mussoorie.location();
        mussoorie.famousFor();

        // Gulmarg
        gulmarg.location();
        gulmarg.famousFor();

        System.out.println();

        // Calling location() and famousFor() using subclass objects directly
        System.out.println("Using subclass objects directly:");

        Manali manaliObj = new Manali();
        manaliObj.location();
        manaliObj.famousFor();

        Mussoorie mussoorieObj = new Mussoorie();
        mussoorieObj.location();
        mussoorieObj.famousFor();

        Gulmarg gulmargObj = new Gulmarg();
        gulmargObj.location();
        gulmargObj.famousFor();
    }
}

