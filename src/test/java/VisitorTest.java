import org.junit.Before;
import org.junit.Test;
import park.Park;
import park.Visitors.AnnoyingKid;
import park.Visitors.ChaosTheorist;
import park.Visitors.Guest;
import park.Visitors.Paleontologist;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    ChaosTheorist ianMalcolm;
    Paleontologist allanGrant;
    AnnoyingKid boring;

    Park park;

    @Before
    public void before(){
        ianMalcolm = new ChaosTheorist("Jeff Goldblum", "Chaos theorist");
        allanGrant = new Paleontologist("Sam Neill", "Paleontologist");
        boring = new AnnoyingKid("who cares", "be annoying");
        park = new Park("Jurassic Park");

        park.addVisitor(ianMalcolm);
        park.addVisitor(allanGrant);
    }

    @Test
    public void canGetEaten(){
        assertEquals("waaa please no!", boring.getEaten());
        assertEquals("who could have predicted that!", ianMalcolm.getEaten());
        assertEquals("GOD WHY!", allanGrant.getEaten());
    }

}
