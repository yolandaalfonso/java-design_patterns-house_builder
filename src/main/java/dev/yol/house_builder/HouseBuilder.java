package dev.yol.house_builder;

public class HouseBuilder implements Builder{
    private HouseType type;
    private Garage garage;
    private SwimmingPool pool;
    private Garden garden;
    private Statues statues

    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public  void setSwimmingPool(SwimmingPool pool) {
        this.pool = pool;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public void setFancyStatues(Statues statues) {
        this.statues = statues;
    }

    public House getResult() {
        return new House(type, garage, pool, garden, statues);
    }

}
