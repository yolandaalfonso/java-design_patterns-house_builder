package dev.yol.house_builder;

public interface Builder {
    void setHouseType(HouseType type);
    void setGarage(Garage garage);
    void setSwimmingPool(SwimmingPool pool);
    void setGarden(Garden garden);
    void setFancyStatues(Statues statues);
}
