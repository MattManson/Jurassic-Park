package park.Visitors;

public class ChaosTheorist extends Guest {

    public ChaosTheorist(String name, String occupation) {
        super(name, occupation);
        this.setName("Jeff Goldblum");
        this.setOccupation("Chaos Theorist");
    }

    @Override
    public String getEaten() {
        return "who could have predicted that!";
    }
}
