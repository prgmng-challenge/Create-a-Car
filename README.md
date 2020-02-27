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
the functionality you implemented.

### Examples
#### Compiling and Running
After compiling Vehicle.java to create Vehicle.class, save and compile your new class. My new class in this example is in the file 
Duckboat.java. This is what my folder looks like:

[My code directory](Create-a-Car/Vehicle_folder.png)

First I compile my new class:

```javac Duckboat.java```

Now compile ShowOffMyVehicle.java:

```javac ShowOffMyVehicle.java```

Now run ShowOffMyVehicle:

```java ShowOffMyVehicle```

#### Example Subclass
**NOTE: This code does not necessarily satisfy the rules of this challenge**

```Java
class Duckboat {
  public Duckboat(String make, String model, String color){
    this.make = make;
    this.model = model;
    this.color = color;
  }
  
  public void travel(String destination){
    System.out.println("The " + this.color + " duckboat travelled to " + destination + "!");
  }
}
```

#### Example ShowOffMyVehicle.java
**NOTE: This code does not necessarily satisfy the rules of this challenge**

```Java
public class ShowOffMyVehicle {
  public static void main (String [] args) {
    Duckboat d = new Duckboat("Crestliner", "Retriever", "Brown Camo");
    d.travel("New Orleans");
  }
}
```

**Sample Output:**
```
The Brown Camo duckboat travelled to New Orleans!
```


