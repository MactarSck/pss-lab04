package it.unibo;

public class KoratCat implements Diet, Animal{

    private double weight;

    public KoratCat(double weight)
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
