package park.Visitors;

public class AnnoyingKid extends Guest {
    public AnnoyingKid(String name, String occupation) {
        super(name, occupation);
        this.setName("who cares");
        this.setOccupation("be annoying");
    }

    @Override
    public String getEaten() {
        return "waaa please no!";
    }
}
