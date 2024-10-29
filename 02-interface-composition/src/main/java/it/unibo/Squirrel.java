package it.unibo;

public class Squirrel implements Diet, Animal {

    private double weight;

    public Squirrel(double weight)
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
