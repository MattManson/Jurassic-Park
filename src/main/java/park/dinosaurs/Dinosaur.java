package park.dinosaurs;

import park.animals.behaviours.IFood;
import park.*;

import java.util.ArrayList;

public abstract class Dinosaur{
    private String name;
    private DinoType type;
    private ArrayList<IFood> stomach;
    private String breed;

    public Dinosaur(String name, DinoType type, String breed){
        this.name = name;
        this.type = type;
        this.stomach = new ArrayList<>();
        this.breed = breed;
    }

    public String getName(){return this.name;}
    public String getBreed(){return this.breed;}
    public void setBreed(String breed){
        this.breed = breed;
    }

    public DinoType getType(){return this.type;}
    public void setType(DinoType dinoType){
        this.type = dinoType;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String eat(Food food) {
        String result = null;
        if(this.type.equals(DinoType.CARNIVORE) && food.meat == true || this.type.equals(DinoType.HERBIVORE) && food.meat == false){
            stomach.add(food);
            result = "CHOMP!";
        }else result = "no thanks!";
        return result;
    }

    public int stomachSize() {
        return this.stomach.size();
    }
}
