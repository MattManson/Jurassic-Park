package park.dinosaurs;

public class Diplodocus extends Dinosaur{
    public Diplodocus(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.HERBIVORE);
        this.setBreed("Diplodocus");
    }

}
