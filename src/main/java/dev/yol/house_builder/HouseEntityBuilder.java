package dev.yol.house_builder;

public class HouseEntityBuilder implements IHouseBuilder{
    
    private House house;

    public HouseEntityBuilder() {
        this.house = new House();
    }

    @Override
    public IHouseBuilder buildGarage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    @Override
    public IHouseBuilder buildJardin(boolean jardin) {
        house.setJardin(jardin);
        return this;
    }

    @Override
    public IHouseBuilder buildPiscina(boolean piscina) {
        house.setPiscina(piscina);
        return this;
    }

    @Override
    public IHouseBuilder buildEstatuas(boolean estatuas) {
        house.setEstatuas(estatuas);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }

    
}
