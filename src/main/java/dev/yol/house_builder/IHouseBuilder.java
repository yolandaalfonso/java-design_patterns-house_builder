package dev.yol.house_builder;

public interface IHouseBuilder {
    IHouseBuilder buildGarage(boolean garage);
    IHouseBuilder buildJardin(boolean jardin);
    IHouseBuilder buildPiscina(boolean piscina);
    IHouseBuilder buildEstatuas(boolean estatuas);
    House build();
}
