import org.junit.Before;
import org.junit.Test;
import park.Paddock;
import park.dinosaurs.*;

import static org.junit.Assert.assertEquals;

public class ParkTest {

//    paddocks
    Paddock paddock1;
    Paddock paddock2;
    Paddock paddock3;
    Paddock paddock4;

//    herbivores
    Triceratops triceratops;
    Triceratops triceratops2;
    Brachiosaurus brachiosaurus1;
    Brachiosaurus brachiosaurus2;
    Stegosaurus stegosaurus1;
    Stegosaurus stegosaurus2;

//    carnivores
    Trex trex;
    Velociraptor velociraptor;
    Velociraptor velociraptor2;
    Velociraptor velociraptor3;

    @Before
    public void before(){
        paddock1 = new Paddock("plant-eaters", DinoType.HERBIVORE);
        paddock2 = new Paddock("velociraptors only", DinoType.CARNIVORE);
        paddock3 = new Paddock("herbivore holding", DinoType.HERBIVORE);
        paddock4 = new Paddock("raptor holding", DinoType.CARNIVORE);

        trex = new Trex("Bob", DinoType.CARNIVORE, "Tyrannosaurus Rex");
        velociraptor = new Velociraptor("Jim", DinoType.CARNIVORE,"Velociraptor");
        velociraptor2 = new Velociraptor("Jack", DinoType.CARNIVORE, "Velociraptor");
        velociraptor3 = new Velociraptor("Jerry", DinoType.CARNIVORE, "Velociraptor");

        triceratops = new Triceratops("Sally", DinoType.HERBIVORE, "Triceratops");
        triceratops2 = new Triceratops("Sarah", DinoType.HERBIVORE, "Triceratops");
        brachiosaurus1 = new Brachiosaurus("Humphrey", DinoType.HERBIVORE, "Brachiosaurus");
        brachiosaurus2 = new Brachiosaurus("Harold", DinoType.HERBIVORE, "brachiosaurus");
        stegosaurus1 = new Stegosaurus("Mack", DinoType.HERBIVORE, "Stegosaurus");
        stegosaurus2 = new Stegosaurus("Marlon", DinoType.HERBIVORE, "Stegosaurus");

        paddock3.addDino(stegosaurus2);
        paddock3.addDino(stegosaurus1);

        paddock2.addDino(velociraptor2);
        paddock2.addDino(velociraptor3);
    }

    @Test
    public void canAddHerbivores(){
        paddock1.addDino(triceratops);
        assertEquals(1, paddock1.getSize());
        assertEquals("added Sally!",paddock1.addDino(triceratops));
    }

    @Test
    public void canNotAddCarnivores(){
        paddock3.addDino(trex);
        assertEquals(2, paddock2.getSize());
        assertEquals("Bob incompatible!",paddock3.addDino(trex));
    }

    @Test
    public void canGetDinoType(){
        assertEquals(DinoType.HERBIVORE, paddock1.getDinoType());
    }

    @Test
    public void canAddCarnivore(){
        paddock2.addDino(velociraptor);
        assertEquals(3, paddock2.getSize());
        assertEquals("added Jim!", paddock2.addDino(velociraptor));
    }

    @Test
    public void cantAddDifferentCarnivores(){
        paddock2.addDino(trex);
        assertEquals(2, paddock2.getSize());
        assertEquals("Bob incompatible!", paddock2.addDino(trex));
    }

}
