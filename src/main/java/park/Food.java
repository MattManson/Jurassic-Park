package park;

import park.animals.behaviours.IFood;

public abstract class Food implements IFood {
    private String name;
    protected boolean meat;

    public Food(String name, boolean meat) {
        this.name = name;
        this.meat = meat;
    }

    @Override
    public String getEaten() {
        return null;
    }
}
