package park;

import park.dinosaurs.DinoType;
import park.dinosaurs.Dinosaur;
import park.dinosaurs.Stegosaurus;
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

    public boolean isEmpty(){
        return this.contents.size() == 0;
    }

    public String getBreed(){
        return this.contents.get(0).getBreed();
    }

    public boolean addDino(Dinosaur dinosaur) {

        if(isEmpty() && this.dinoType.equals(dinosaur.getType())){
            contents.add(dinosaur);
            return true;
        }

        else if(this.dinoType.equals(dinosaur.getType()) && this.dinoType.equals(DinoType.HERBIVORE)){
            contents.add(dinosaur);
            return true;
        }

        else if (getBreed().equals(dinosaur.getBreed())){
            contents.add(dinosaur);
            return true;
        }
        else {
            return false;
        }

    }

    public int getSize() {
        return contents.size();
    }

    public DinoType getDinoType() {
        return dinoType;
    }

    public Dinosaur removeDino(Dinosaur dinosaur) {
        this.contents.remove(dinosaur);
        return dinosaur;
    }

    public boolean moveDino(Dinosaur dinosaur, Paddock newPaddock) {
        if (!dinoPresent(dinosaur)){
            return false;
        }
        removeDino(dinosaur);
        return newPaddock.addDino(dinosaur);
    }

    public boolean dinoPresent(Dinosaur dinosaur){
        return contents.contains(dinosaur);
    }

}
