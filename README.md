# Create-a-Car
Extend the Vehicle class, override/implement its methods and add your own functionality.

## Challenge Description
In the folder [prgmng-challenge/Create-a-Car/src](/src) there is a file, Vehicle.java. This file defines the class Vehicle. To complete 
this challenge, create a new .java file, and in it, define a new class that extends Vehicle. In your new class you MUST:
1. define a contructor that accepts parameters to set the properties ```make```, ```model```, and ```color```.
2. override the ```add_passenger()```, ```remove_passenger()```, and ```travel(String destination)``` methods and provide 
an implementation for them. **NOTE: Your ```travel()``` method MUST make use of at least one of the properties ```num_seats``` or
```num_passengers``` from your class.**
3. use the template file ShowOffMyVehicle.java and its main method to create an instance of your new class and add some code to display
the functionality you implemented.

### Examples
#### Compiling and Running
After compiling Vehicle.java to create Vehicle.class, save and compile your new class. My new class in this example is in the file 
Duckboat.java. This is what my folder looks like:

![My code directory](vehicle_folder.png)

First I compile my new class:

```javac Duckboat.java```

Now compile ShowOffMyVehicle.java:

```javac ShowOffMyVehicle.java```

Now run ShowOffMyVehicle:

```java ShowOffMyVehicle```

#### Example Subclass
**NOTE: This code does not necessarily satisfy the rules of this challenge**

```Java
class Duckboat extends Vehicle {
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

#### Submitting

To submit your code, click the "Fork" button in the top-right and complete the process to create a copy of this repository in your own
Github account. Back in your account, navigate to the ```src``` folder and use the "Download" button to download a copy of the files to work with locally.
Once you've completed your code, upload a folder (with your Github username as the name) containing your ```.java``` files to the ```
submissions``` folder (in your account). Then click the "Create Pull Request" button and complete the process to create a pull request that will request 
to add the changes you made to your copy of the repository to this one. If your submission satisfies the rules, you will receive
confirmation that your pull request has been merged (which is to say, your submission was accepted).

