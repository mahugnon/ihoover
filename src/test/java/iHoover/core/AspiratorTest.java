package iHoover.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AspiratorTest {
    Aspirator aspirator;
    @BeforeEach
    void setUp() {
        Grille grille = new Grille(10,10);
        aspirator = new Aspirator(5,5,'N',grille);

    }

    @Test
    void testMoveDNE() {
        aspirator.setOrientation('N');
        aspirator.move("D");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('E'),aspirator.getOrientation());
    }

    @Test
    void moveDES() {
        aspirator.setOrientation('E');
        aspirator.move("D");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('S'),aspirator.getOrientation());
    }
    @Test
    void moveDSW() {
        aspirator.setOrientation('S');
        aspirator.move("D");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('W'),aspirator.getOrientation());
    }
    @Test
    void moveDWN() {
        aspirator.setOrientation('W');
        aspirator.move("D");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('N'),aspirator.getOrientation());
    }
    @Test
    void moveGNW() {
        aspirator.setOrientation('N');
        aspirator.move("G");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('W'),aspirator.getOrientation());
    }
    @Test
    void moveGWS() {
        aspirator.setOrientation('W');
        aspirator.move("G");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('S'),aspirator.getOrientation());
    }
    @Test
    void moveGSE() {
        aspirator.setOrientation('S');
        aspirator.move("G");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('E'),aspirator.getOrientation());
    }
    @Test
    void moveGEN() {
        aspirator.setOrientation('E');
        aspirator.move("G");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('N'),aspirator.getOrientation());
    }
    @Test
    void moveAN() {
        aspirator.setOrientation('N');
        aspirator.move("A");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(6,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('N'),aspirator.getOrientation());
    }

    @Test
    void moveAE() {
        aspirator.setOrientation('E');
        aspirator.move("A");
        Assertions.assertEquals(6,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('E'),aspirator.getOrientation());
    }

    @Test
    void moveAS() {
        aspirator.setOrientation('S');
        aspirator.move("A");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(4,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('S'),aspirator.getOrientation());
    }
    @Test
    void moveAW() {
        aspirator.setOrientation('W');
        aspirator.move("A");
        Assertions.assertEquals(4,aspirator.getX());
        Assertions.assertEquals(5,aspirator.getY());
        Assertions.assertEquals( Character.valueOf('W'),aspirator.getOrientation());
    }

    @Test
    void move() {
        aspirator.setOrientation('N');
        aspirator.move("DADADADAA");
        Assertions.assertEquals(5,aspirator.getX());
        Assertions.assertEquals(6,aspirator.getY());
        Assertions.assertEquals(Character.valueOf('N'),aspirator.getOrientation());
    }
}