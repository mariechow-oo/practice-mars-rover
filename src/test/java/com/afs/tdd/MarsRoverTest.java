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
        assertEquals("N", marsRover.getDirectionString());
    }
    @Test
    void should_got_to_0_negative_1_S_when_execute_command_given_0_0_S_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        // when
        marsRover.executeCommand("M");
        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirectionString());
    }
    @Test
    void should_got_to_1_0_E_when_execute_command_given_0_0_E_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        // when
        marsRover.executeCommand("M");
        // then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirectionString());
    }
    @Test
    void should_got_to_negative_1_0_W_when_execute_command_given_0_0_W_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        // when
        marsRover.executeCommand("M");
        // then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirectionString());
    }
    @Test
    void should_got_to_0_0_W_when_execute_command_given_0_0_N_and_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        // when
        marsRover.executeCommand("L");
        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirectionString());
    }
    @Test
    void should_got_to_0_0_E_when_execute_command_given_0_0_S_and_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        // when
        marsRover.executeCommand("L");
        // then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirectionString());
    }
}
