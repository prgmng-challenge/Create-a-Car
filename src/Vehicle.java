public class Vehicle {
    /*-----------------------------------------------------------------------------------
    All properties are private so they CANNOT be directly accessed through an instance
    such as with the statement:

        Vehicle myVehicle = new Vehicle(); // WILL NOT COMPILE, SEE BELOW
        myVehicle.model = "Chevrolet"; // DOES NOT COMPILE

    They may only be accessed via getters or setters, which are methods you add to your
    subclass that return or modify the values within these properties.
    -------------------------------------------------------------------------------------
    */
    private String make;
    private String model;
    private String color;
    private int num_seats;
    private int num_passengers;
    /*-----------------------------------------------------------------------------------
    */


    /*------------------------------------------------------------------------------------
    Contructor is private so that it cannot be instantiated with the statement: 
    
    Vehicle myVehicle = new Vehicle(); / WILL NOT COMPILE

    This is because there is no such thing as a generic vehicle; all other vehicles are 
    descended from the Vehicle class
    ------------------------------------------------------------------------------------
    */

    private Vehicle(){

    }

    /*-------------------------------------------------------------------------------------
    */

    public void add_passenger(){

    }

    public void remove_passenger(){

    }

    public void travel(String destination){

    }

}