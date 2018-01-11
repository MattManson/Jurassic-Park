package park.dinosaurs;

public class Trex extends Dinosaur {

    public Trex(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.CARNIVORE);
        this.setBreed("Tyrannosaurus Rex");
    }

    public String speak() {
        return "RAWR";
    }


}
