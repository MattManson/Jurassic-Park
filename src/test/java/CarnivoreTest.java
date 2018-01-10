import org.junit.Before;
import org.junit.Test;
import park.*;

import static org.junit.Assert.assertEquals;

public class CarnivoreTest {

    Trex trex;
    Velociraptor velociraptor;
    LiveCow liveCow;
    Foliage foliage;

    @Before
    public void before(){
        trex = new Trex("Tyrannosaurus Rex", DinoType.CARNIVORE, true);
        velociraptor = new Velociraptor("Velociraptor", DinoType.CARNIVORE, true);
        liveCow = new LiveCow("betty", true);
        foliage = new Foliage("plant", false);
    }

    @Test
    public void canSpeak(){
        assertEquals("RAWR", trex.speak());
        assertEquals("REEEE", velociraptor.speak());
    }

    @Test
    public void getName(){
        assertEquals("Tyrannosaurus Rex", trex.getName());
        assertEquals("Velociraptor", velociraptor.getName());
    }

    @Test
    public void setName(){
        trex.setName("T-Rex");
        velociraptor.setName("Clever Girl");
        assertEquals("T-Rex", trex.getName());
        assertEquals("Clever Girl", velociraptor.getName());
    }

    @Test
    public void getType(){
        assertEquals(DinoType.CARNIVORE, velociraptor.getType());
        assertEquals(DinoType.CARNIVORE, trex.getType());
    }

    @Test
    public void canEat(){
        velociraptor.eat(liveCow);
        assertEquals(1, velociraptor.stomachSize());
        assertEquals("CHOMP!", velociraptor.eat(liveCow));
        trex.eat(liveCow);
        assertEquals(1, trex.stomachSize());
        assertEquals("CHOMP!", trex.eat(liveCow));
    }

    @Test
    public void cantEatVeg(){
        trex.eat(foliage);
        velociraptor.eat(foliage);
        assertEquals(0, trex.stomachSize());
        assertEquals("no thanks!", trex.eat(foliage));
        assertEquals(0, velociraptor.stomachSize());
        assertEquals("no thanks!", velociraptor.eat(foliage));

    }


}
