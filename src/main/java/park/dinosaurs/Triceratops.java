package park.dinosaurs;

public class Triceratops extends Dinosaur {
    public Triceratops(String name, DinoType type, String breed) {
        super(name, type, breed);
        this.setType(DinoType.HERBIVORE);
        this.setBreed("Triceratops");
    }


}
