package com.example.intuit.dao;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVReaderTest {

    @Test
    public void testRead() {

        List<Player> players = CSVReader.read("c:\\users\\korsh\\Downloads\\People.csv");
        assertEquals(players.size(),2000);
    }
}
