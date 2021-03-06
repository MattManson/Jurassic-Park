import org.junit.Before;
import org.junit.Test;
import park.Paddock;
import park.dinosaurs.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PaddockTest {

//    paddocks
    Paddock paddock1;
    Paddock paddock2;
    Paddock paddock3;
    Paddock paddock4;
    Paddock tRexpaddock;

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
        tRexpaddock = new Paddock("T REX PADDOCK", DinoType.CARNIVORE);

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

        tRexpaddock.addDino(trex);
    }

    @Test
    public void canRemoveDino(){
        paddock3.removeDino(stegosaurus1);
        assertEquals(1, paddock3.getSize());
    }

    @Test
    public void canMoveDino() {
        paddock3.moveDino(stegosaurus1, paddock1);
        assertEquals(1, paddock1.getSize());
        assertEquals(true, paddock3.moveDino(stegosaurus2, paddock1));
    }

    @Test
    public void canAddHerbivores(){
        paddock1.addDino(triceratops);
        assertEquals(1, paddock1.getSize());
        assertEquals(true,paddock1.addDino(triceratops));
    }

    @Test
    public void canNotAddCarnivores(){
        paddock3.addDino(trex);
        assertEquals(2, paddock3.getSize());
        assertEquals(false,paddock3.addDino(trex));
    }

    @Test
    public void canGetDinoType(){
        assertEquals(DinoType.HERBIVORE, paddock1.getDinoType());
    }

    @Test
    public void canAddCarnivore(){
        paddock2.addDino(velociraptor);
        assertEquals(3, paddock2.getSize());
        assertEquals(true, paddock2.addDino(velociraptor));
    }

    @Test
    public void cantAddDifferentCarnivores(){
        paddock2.addDino(trex);
        assertEquals(2, paddock2.getSize());
        assertEquals(false, paddock2.addDino(trex));
        assertEquals(false, tRexpaddock.addDino(velociraptor));
    }

    @Test
    public void moveDino__CarnToHerb(){
        paddock3.addDino(trex);
        paddock2.moveDino(velociraptor3, paddock3);
        assertEquals(2, paddock2.getSize());
        assertEquals(2, paddock3.getSize());
        assertEquals(false, paddock3.addDino(trex));
        assertEquals(false, paddock2.moveDino(velociraptor2, paddock3));
    }

    @Test
    public void addDino__HerbToCarn(){
        paddock2.addDino(stegosaurus1);
        assertEquals(2, paddock2.getSize());
        assertEquals(false, paddock2.addDino(stegosaurus1));
    }
    @Test
    public void cantMoveDino__HerbToCarn(){
        paddock3.moveDino(stegosaurus1,paddock2);
        assertEquals(2, paddock3.getSize());
        assertEquals(2, paddock2.getSize());
        assertEquals(false, paddock3.moveDino(stegosaurus2,paddock2));
    }




}
