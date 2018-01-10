package park;

import java.util.ArrayList;

public class Trex extends Dinosaur {



    public Trex(String name, DinoType type, boolean carnivore) {
        super(name, type, carnivore);
        this.stomach = new ArrayList<>();
        this.carnivore = true;
    }

    public String speak() {
        return "RAWR";
    }


}
