package it.unibo;


public class SiameseCat implements Diet, Animal {

    private double weight;
    private boolean herbivore;
    private boolean Omnivore;
    private boolean Carnovore;

    public SiameseCat(double weight)
    {
        this.weight = weight;
        this.herbivore= false;
        this.Omnivore = false;
        this.Carnovore = true;
        
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

        return true;
    }
}
