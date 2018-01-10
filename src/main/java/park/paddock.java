package park;

import park.dinosaurs.DinoType;
import park.dinosaurs.Dinosaur;
import park.dinosaurs.Triceratops;

import java.awt.*;
import java.util.ArrayList;

public class Paddock {

    public String name;
    public DinoType dinoType;
    public ArrayList<Dinosaur> contents;

    public Paddock(String name, DinoType dinoType) {
        this.name = name;
        this.dinoType = dinoType;
        this.contents = new ArrayList<>();
    }

    public String addDino(Dinosaur dinosaur) {
        String result;

        if(this.contents.size() == 0 && this.dinoType.equals(dinosaur.getType())){
            contents.add(dinosaur);
            return "added " + dinosaur.getName() + "!";
        }

        else if(this.dinoType.equals(dinosaur.getType()) && this.dinoType.equals(DinoType.HERBIVORE)){
            contents.add(dinosaur);
            return "added " + dinosaur.getName() + "!";
        }

        else if (this.contents.get(0).getBreed().equals(dinosaur.getBreed())){
            contents.add(dinosaur);
            result = "added " + dinosaur.getName() + "!";
        }
        else {
            result = dinosaur.getName() + " incompatible!";
        }

        return result;

    }

    public int getSize() {
        return contents.size();
    }

    public DinoType getDinoType() {
        return dinoType;
    }

}
