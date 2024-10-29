package it.unibo;


public class SiameseCat implements Diet, Animal {

    private double weight;

    public SiameseCat(double weight)
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
