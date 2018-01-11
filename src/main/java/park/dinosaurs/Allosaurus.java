package park.dinosaurs;

public class Allosaurus extends Dinosaur{
    public Allosaurus(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.CARNIVORE);
        this.setBreed("Allosaurus");
    }

    public String speak() {
        return "RAWR";
    }
}
