package park.dinosaurs;

public class Stegosaurus extends Dinosaur{

    public Stegosaurus(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.HERBIVORE);
        this.setBreed("Stegosaurus");
    }
}
