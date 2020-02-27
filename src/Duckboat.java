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