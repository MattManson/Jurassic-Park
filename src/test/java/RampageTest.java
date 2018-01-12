import org.junit.Before;
import org.junit.Test;
import park.Paddock;
import park.Park;
import park.Visitors.AnnoyingKid;
import park.Visitors.ChaosTheorist;
import park.Visitors.Paleontologist;
import park.dinosaurs.*;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RampageTest {

    //    PARK
    Park park;

    //    PADDOCKS

    Paddock herbivorePaddock1;
    Paddock herbivorePaddock2;
    Paddock herbivoreHolding;
    Paddock raptorPaddock;
    Paddock tRexPaddock;
    Paddock carnivoreHolding;

    //    HERBIVORES
    Triceratops triceratops1;
    Triceratops triceratops2;
    Brachiosaurus brachiosaurus1;
    Brachiosaurus brachiosaurus2;
    Stegosaurus stegosaurus1;
    Stegosaurus stegosaurus2;

    //    CARNIOVRES
    Trex trex;
    Velociraptor raptor1;
    Velociraptor raptor2;
    Velociraptor raptor3;

    //    GUESTS
    ChaosTheorist ianMalcolm;
    Paleontologist allanGrant;
    AnnoyingKid boring;

    @Before
    public void before() {

        park = new Park("Jurassic Park");

        herbivoreHolding = new Paddock("Herbivore Holding", DinoType.HERBIVORE);
        herbivorePaddock1 = new Paddock("Herb 1", DinoType.HERBIVORE);
        herbivorePaddock2 = new Paddock("Herb 2", DinoType.HERBIVORE);
        raptorPaddock = new Paddock("Raptor Paddock", DinoType.CARNIVORE);
        tRexPaddock = new Paddock("T-Rex Paddock", DinoType.CARNIVORE);
        carnivoreHolding = new Paddock("Carnivore Holding", DinoType.CARNIVORE);


        triceratops1 = new Triceratops("Sally", DinoType.HERBIVORE, "Triceratops");
        triceratops2 = new Triceratops("Sarah", DinoType.HERBIVORE, "Triceratops");
        brachiosaurus1 = new Brachiosaurus("Humphrey", DinoType.HERBIVORE, "Brachiosaurus");
        brachiosaurus2 = new Brachiosaurus("Harold", DinoType.HERBIVORE, "Brachiosaurus");
        stegosaurus1 = new Stegosaurus("Mack", DinoType.HERBIVORE, "Stegosaurus");
        stegosaurus2 = new Stegosaurus("Marlon", DinoType.HERBIVORE, "Stegosaurus");

        trex = new Trex("Bob", DinoType.CARNIVORE, "Tyrannosaurus Rex");
        raptor1 = new Velociraptor("Jim", DinoType.CARNIVORE,"Velociraptor");
        raptor2 = new Velociraptor("Jack", DinoType.CARNIVORE, "Velociraptor");
        raptor3 = new Velociraptor("Jerry", DinoType.CARNIVORE, "Velociraptor");

        ianMalcolm = new ChaosTheorist("Jeff Goldblum", "Chaos theorist");
        allanGrant = new Paleontologist("Sam Neill", "Paleontologist");
        boring = new AnnoyingKid("who cares", "be annoying");
        park = new Park("Jurassic Park");

        park.addVisitor(ianMalcolm);
        park.addVisitor(allanGrant);

        park.addPaddock(herbivorePaddock1);
        park.addPaddock(herbivorePaddock2);
        park.addPaddock(raptorPaddock);
        park.addPaddock(tRexPaddock);

        park.addDino(raptor1, raptorPaddock);
        park.addDino(raptor2, raptorPaddock);
        park.addDino(raptor3, raptorPaddock);
        park.addDino(trex, tRexPaddock);

        park.addDino(triceratops1, herbivorePaddock1);
        park.addDino(triceratops2, herbivorePaddock1);
        park.addDino(brachiosaurus1, herbivorePaddock1);
        park.addDino(brachiosaurus2, herbivorePaddock1);
        park.addDino(stegosaurus1, herbivorePaddock2);
        park.addDino(stegosaurus2, herbivorePaddock2);

    }

    @Test
    public void canRandomDino(){
        assertThat(park.removeRandomDino(), instanceOf(Dinosaur.class));
        System.out.println(park.removeRandomDino());
    }

    @Test
    public void canRampageArrayFull(){
        park.randomRampage();
        assertEquals(1, park.countRampagingDino());
    }

}

