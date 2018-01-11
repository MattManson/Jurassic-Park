package park.Visitors;

import park.Park;
import park.animals.behaviours.IFood;

public abstract class Guest implements IFood {

    private String name;
    private String occupation;
    private boolean meat;

    public Guest(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
        this.meat = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isMeat(){
        return this.meat;
    }


}
