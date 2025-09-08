package dev.yol.house_builder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HouseDirectorTests {
    @Test
    void testBuildBasicHouse() {
        House house = HouseDirector.buildBasicHouse();

        assertFalse(house.hasGarage());
        assertFalse(house.hasJardin());
        assertFalse(house.hasPiscina());
        assertFalse(house.hasEstatuas());
    }

    @Test
    void testBuildHouseWhithGarage() {
        House house = HouseDirector.buildHouseWhithGarage();

        assertTrue(house.hasGarage());
        assertFalse(house.hasJardin());
        assertFalse(house.hasPiscina());
        assertFalse(house.hasEstatuas());
    }

    @Test
    void testBuildHouseWithFancyStatues() {
        House house = HouseDirector.buildHouseWithFancyStatues();

        assertFalse(house.hasGarage());
        assertFalse(house.hasJardin());
        assertFalse(house.hasPiscina());
        assertTrue(house.hasEstatuas());
    }

    @Test
    void testBuildHouseWithGarden() {
        House house = HouseDirector.buildHouseWithGarden();

        assertFalse(house.hasGarage());
        assertTrue(house.hasJardin());
        assertFalse(house.hasPiscina());
        assertFalse(house.hasEstatuas());
    }

    @Test
    void testBuildHouseWithSwimmingPool() {
        House house = HouseDirector.buildHouseWithSwimmingPool();

        assertFalse(house.hasGarage());
        assertFalse(house.hasJardin());
        assertTrue(house.hasPiscina());
        assertFalse(house.hasEstatuas());
    }
}
