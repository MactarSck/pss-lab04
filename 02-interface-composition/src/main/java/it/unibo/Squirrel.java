package it.unibo;

public class Squirrel implements Diet, Animal {

    private double weight;
    private boolean herbivore;
    private boolean omnivore;
    private boolean carnovore;
    

    public Squirrel(double weight)
    {
        this.weight = weight;
        this.herbivore= true;
        this.omnivore = false;
        this.carnovore = false;
    }

    public boolean canEatVegetables()
    {
        if(this.herbivore == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean canEat(Animal a){

        if(this.carnovore == true)
        {
            return true;
        }
        else{
            return false;

        }
    }
    
}
