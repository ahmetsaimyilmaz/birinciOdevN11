package entity;


import constants.HouseType;

public class House extends BaseHouse{

    public House(double totalArea, double price, int numberOfRooms, int numberOfLivingRooms) {
        super(totalArea, price, numberOfRooms, numberOfLivingRooms);
    }

    @Override
    public HouseType getHomeType() {
        return HouseType.HOUSE;
    }
}
