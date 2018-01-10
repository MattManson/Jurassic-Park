import org.junit.Before;
import org.junit.Test;
import park.Paddock;
import park.dinosaurs.DinoType;
import park.dinosaurs.Trex;
import park.dinosaurs.Triceratops;
import park.dinosaurs.Velociraptor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Paddock paddock1;
    Paddock paddock2;
    Paddock paddock3;
    Triceratops triceratops;
    Trex trex;
    Velociraptor velociraptor;

    @Before
    public void before(){
        paddock1 = new Paddock("plant-eaters", DinoType.HERBIVORE);
        paddock2 = new Paddock("velociraptors only", DinoType.CARNIVORE);
        paddock3 = new Paddock(" herbivore holding", DinoType.HERBIVORE);
        trex = new Trex("Bob", DinoType.CARNIVORE, "Tyrannosaurus Rex");
        velociraptor = new Velociraptor("Jim", DinoType.CARNIVORE,"Velociraptor");
        triceratops = new Triceratops("Sally", DinoType.HERBIVORE, "Triceratops");
    }

    @Test
    public void canAddHerbivores(){
        paddock1.addDino(triceratops);
        assertEquals(1, paddock1.getSize());
    }

    @Test
    public void canGetDinoType(){
        assertEquals(DinoType.HERBIVORE, paddock1.getDinoType());
    }

}
