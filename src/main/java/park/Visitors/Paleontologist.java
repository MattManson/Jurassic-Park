package park.Visitors;

public class Paleontologist extends Guest {
    public Paleontologist(String name, String occupation) {
        super(name, occupation);
        this.setName("Sam Neill");
        this.setOccupation("Paleontologist");
    }

    @Override
    public String getEaten() {
        return "GOD WHY!";
    }
}
