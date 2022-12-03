package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_got_to_0_1_N_when_execute_command_given_0_0_N_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        // when
        marsRover.executeCommand("M");
        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
