package entity;


import constants.HouseType;

public class SummerHouse extends BaseHouse{

    public SummerHouse(double totalArea, double price, int numberOfRooms, int numberOfLivingRooms) {
        super(totalArea, price, numberOfRooms, numberOfLivingRooms);
    }
    @Override
    public HouseType getHomeType() {
        return HouseType.SUMMERHOUSE;
    }
}
