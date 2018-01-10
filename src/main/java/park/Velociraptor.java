package park;

import java.util.ArrayList;

public class Velociraptor extends Dinosaur{

    public Velociraptor(String name, DinoType type, boolean carnivore) {
        super(name, type, carnivore);
        this.stomach = new ArrayList<>();
        this.carnivore = true;
    }

    public String speak() {
        return "REEEE";
    }

}
