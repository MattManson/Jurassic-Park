package park.dinosaurs;

import java.util.ArrayList;

public class Velociraptor extends Dinosaur{

    public Velociraptor(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.CARNIVORE);
        this.setBreed("Velociraptor");
    }

    public String speak() {
        return "REEEE";
    }

}
