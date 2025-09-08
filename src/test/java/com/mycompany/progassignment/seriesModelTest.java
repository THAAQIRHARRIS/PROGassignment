/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.progassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */

public class seriesModelTest {

    private seriesModel instance;

    public seriesModelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Create a test object before each test
        instance = new seriesModel("S001", "Breaking Bad", 18, 62);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetSeriesId() {
        assertEquals("S001", instance.getSeriesId());
    }

    @Test
    public void testSetSeriesId() {
        instance.setSeriesId("S002");
        assertEquals("S002", instance.getSeriesId());
    }

    @Test
    public void testGetSeriesName() {
        assertEquals("Breaking Bad", instance.getSeriesName());
    }

    @Test
    public void testSetSeriesName() {
        instance.setSeriesName("Game of Thrones");
        assertEquals("Game of Thrones", instance.getSeriesName());
    }

    @Test
    public void testGetSeriesAgeRestriction() {
        assertEquals(18, instance.getSeriesAgeRestriction());
    }

    @Test
    public void testSetSeriesAgeRestriction() {
        instance.setSeriesAgeRestriction(16);
        assertEquals(16, instance.getSeriesAgeRestriction());
    }

    @Test
    public void testGetSeriesNumberOfEpisodes() {
        assertEquals(62, instance.getSeriesNumberOfEpisodes());
    }

    @Test
    public void testSetSeriesNumberOfEpisodes() {
        instance.setSeriesNumberOfEpisodes(73);
        assertEquals(73, instance.getSeriesNumberOfEpisodes());
    }

    @Test
    public void testToString() {
        String expected = "SERIES ID: S001" +
                "\nSERIES NAME: Breaking Bad" +
                "\nSERIES AGE RESTRICTION: 18" +
                "\nSERIES NUMBER OF EPISODES: 62";
        assertEquals(expected, instance.toString());
    }
}

