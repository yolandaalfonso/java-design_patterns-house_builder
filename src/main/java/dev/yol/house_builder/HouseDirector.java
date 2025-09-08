package dev.yol.house_builder;

public class HouseDirector {
    
    public static House buildBasicHouse() {
        return new HouseEntityBuilder()
                .buildGarage(false)
                .buildJardin(false)
                .buildPiscina(false)
                .buildEstatuas(false)
                .build();
    }

    public static House buildHouseWhithGarage() {
        return new HouseEntityBuilder()
                .buildGarage(true)
                .buildJardin(false)
                .buildPiscina(false)
                .buildEstatuas(false)
                .build();
    }

    public static House buildHouseWithFancyStatues() {
        return new HouseEntityBuilder()
                .buildGarage(false)
                .buildJardin(false)
                .buildPiscina(false)
                .buildEstatuas(true)
                .build();
    }

    public static House buildHouseWithSwimmingPool() {
        return new HouseEntityBuilder()
                .buildGarage(false)
                .buildJardin(false)
                .buildPiscina(true)
                .buildEstatuas(false)
                .build();
    }

    public static House buildHouseWithGarden() {
        return new HouseEntityBuilder()
                .buildGarage(false)
                .buildJardin(true)
                .buildPiscina(false)
                .buildEstatuas(false)
                .build();
    }
}
