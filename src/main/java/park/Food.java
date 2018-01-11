package park;

import park.animals.behaviours.IFood;

public abstract class Food implements IFood {
    public String name;
    public boolean meat;

    public Food(String name, boolean meat) {
        this.name = name;
        this.meat = meat;
    }

    @Override
    public String getEaten() {
        return null;
    }

    public boolean isMeat(){
        return this.meat;
    }
}
