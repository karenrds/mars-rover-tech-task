package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    public void checkDirection() {
        Rover roverFirstPosition = new Rover(1, 2, "N");
        assertEquals("1 3 N", roverFirstPosition.setDirection("LMLMLMLMM"));

        Rover roverSecondPosition = new Rover(3, 3, "E");
        assertEquals("5 1 E", roverSecondPosition.setDirection("MMRMMRMRRM"));

        Rover roverThirdPosition = new Rover(3, 3, "E");
        assertEquals("OUT BOUNDS", roverSecondPosition.setDirection("MMM"));

        Rover roverFourthPosition = new Rover(0, 0, "E");
        assertEquals("OUT BOUNDS", roverSecondPosition.setDirection("MMMMMM"));

        Rover roverPosition5 = new Rover(5, 5, "W");
        assertEquals("OUT BOUNDS", roverSecondPosition.setDirection("MMMMMM"));

        Rover roverPosition6 = new Rover(0, 0, "N");
        assertEquals("OUT BOUNDS", roverSecondPosition.setDirection("MMMMMM"));

        Rover roverPosition7 = new Rover(5, 5, "S");
        assertEquals("OUT BOUNDS", roverSecondPosition.setDirection("MMMMMM"));
    }
}
