package park.dinosaurs;

import park.Visitors.Guest;
import park.animals.behaviours.IFood;

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

    public String eat(IFood food) {
        String result = null;
        if(this.type.equals(DinoType.CARNIVORE) && food.isMeat() || this.type.equals(DinoType.HERBIVORE) && !food.isMeat()){
            stomach.add(food);
            result = "CHOMP!";
        }else result = "no thanks!";
        return result;
    }

    public int stomachSize() {
        return this.stomach.size();
    }

    public void enrage(Guest guest){
        eat(guest);
    }
}
