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

    public void addDino(Dinosaur dinosaur) {
        if (dinosaur.getType().equals(this.dinoType)|| this.contents.get(0).getBreed() == dinosaur.getBreed()){
            contents.add(dinosaur);
        }
    }

    public int getSize() {
        return contents.size();
    }

    public DinoType getDinoType() {
        return dinoType;
    }

}
