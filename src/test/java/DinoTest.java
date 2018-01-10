import org.junit.Before;
import org.junit.Test;
import park.*;
import park.dinosaurs.DinoType;
import park.dinosaurs.Trex;
import park.dinosaurs.Triceratops;
import park.dinosaurs.Velociraptor;

import static org.junit.Assert.assertEquals;

public class DinoTest {

    Trex trex;
    Velociraptor velociraptor;
    Triceratops triceratops;
    LiveCow liveCow;
    Foliage foliage;

    @Before
    public void before(){
        trex = new Trex("Bob", DinoType.CARNIVORE, "Tyrannosaurus Rex");
        velociraptor = new Velociraptor("Jim", DinoType.CARNIVORE,"Velociraptor");
        triceratops = new Triceratops("Sally", DinoType.HERBIVORE, "Triceratops");
        liveCow = new LiveCow("betty", true);
        foliage = new Foliage("plant", false);
    }

    @Test
    public void canSpeak(){
        assertEquals("RAWR", trex.speak());
        assertEquals("REEEE", velociraptor.speak());
    }

    @Test
    public void getBreed(){
        assertEquals("Tyrannosaurus Rex", trex.getBreed());
        assertEquals("Velociraptor", velociraptor.getBreed());
        assertEquals("Triceratops", triceratops.getBreed());
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
        triceratops.eat(liveCow);
        assertEquals(0, triceratops.stomachSize());
        assertEquals("no thanks!", triceratops.eat(liveCow));
    }

    @Test
    public void canEatVeg(){
        trex.eat(foliage);
        assertEquals(0, trex.stomachSize());
        assertEquals("no thanks!", trex.eat(foliage));
        velociraptor.eat(foliage);
        assertEquals(0, velociraptor.stomachSize());
        assertEquals("no thanks!", velociraptor.eat(foliage));
        triceratops.eat(foliage);
        assertEquals(1, triceratops.stomachSize());
        assertEquals("CHOMP!", triceratops.eat(foliage));
    }


}
