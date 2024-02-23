package entity;


import constants.HouseType;

public abstract class BaseHouse { // This is my Base class. All of the house types have common properties. Only property they differ on is their house types.
    private double area;
    private double price;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public BaseHouse() {
    }

    public BaseHouse(double totalArea, double price, int numberOfRooms, int numberOfLivingRooms) {
        this.area = totalArea;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public abstract HouseType getHomeType();

    public double getTotalArea() {
        return area;
    }

    public void setTotalArea(double totalArea) {
        this.area = totalArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return "BaseHouse{" +
                "area=" + area +
                ", price=" + price +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms +
                '}';
    }
}
