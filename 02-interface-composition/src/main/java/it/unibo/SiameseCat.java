package it.unibo;


public class SiameseCat implements Diet, Animal {

    private double weight;
    private boolean herbivore;
    private boolean omnivore;
    private boolean carnovore;

    public SiameseCat(double weight)
    {
        this.weight = weight;
        this.herbivore= false;
        this.omnivore = false;
        this.carnovore = true;
        
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
