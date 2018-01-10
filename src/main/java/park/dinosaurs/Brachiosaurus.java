package park.dinosaurs;

public class Brachiosaurus extends Dinosaur{
    public Brachiosaurus(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.HERBIVORE);
        this.setBreed("Brachiosaurus");
    }
}
