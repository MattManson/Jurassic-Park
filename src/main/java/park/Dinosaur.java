package park;

import park.animals.behaviours.IFood;

import java.util.ArrayList;

public abstract class Dinosaur{
    private String name;
    private DinoType type;
    protected ArrayList<IFood> stomach;
    protected boolean carnivore;

    public Dinosaur(String name, DinoType type, boolean carnivore){
        this.name = name;
        this.type = type;
        this.stomach = new ArrayList<>();
        this.carnivore = carnivore;
    }

    public String getName(){return this.name;}

    public DinoType getType(){return this.type;}


    public void setName(String name) {
        this.name = name;
    }

    public String eat(Food food) {
        String result = null;
        if(this.carnivore == true && food.meat == true || this.carnivore == false && food.meat == false){
            stomach.add(food);
            result = "CHOMP!";
        }else result = "no thanks!";
        return result;
    }

    public int stomachSize() {
        return this.stomach.size();
    }
}
