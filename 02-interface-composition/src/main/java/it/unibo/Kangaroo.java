package it.unibo;

public class Kangaroo implements  Diet, Animal{

    private double weight;

    public Kangaroo(double weight)
    {
      this.weight = weight;
        
    }
    public boolean canEatVegetables()
    {
        return true;
    }

    public boolean canEat(Animal a){

        return true;
    }
    
}
