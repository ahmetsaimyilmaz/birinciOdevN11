package entity;


import constants.HouseType;

public class Villa extends BaseHouse{

    public Villa(double totalArea, double price, int numberOfRooms, int numberOfLivingRooms) {
        super(totalArea, price, numberOfRooms, numberOfLivingRooms);
    }
    @Override
    public HouseType getHomeType() {
        return HouseType.VILLA;
    }
}
