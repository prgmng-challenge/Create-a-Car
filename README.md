# Create-a-Car
Extend the Vehicle class, override/implement its methods and add your own functionality.

## Challenge Description
In the folder [prgmng-challenge/Create-a-Car/src](/src) there is a file, Vehicle.java. This file defines the class Vehicle. To complete 
this challenge, create a new .java file, and in it, define a new class that extends Vehicle. In your new class you MUST:
1. define a contructor that accepts parameters to set the properties ```make```, ```model```, and ```color```.
2. define getter methods (methods that return the value of a certain private property) for each of the properties of your vehicle.
3. define a setter method for ```num_seats``` (ONLY).
4. override the ```add_passenger()```, ```remove_passenger()```, and ```travel(String destination)``` methods and provide 
an implementation for them. **NOTE: Your ```travel()``` method MUST make use of at least one of the properties of your class using the
Java keyword ```this```.**
5. use the template file ShowOffMyVehicle.java and its main method to create an instance of your new class and add some code to display 
