package service;

import constants.HouseType;
import entity.BaseHouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    private List<BaseHouse> listOfHouses = new ArrayList<>();

    public List<BaseHouse> getListOfHouses() {
        return listOfHouses;
    }

    public void setListOfHouses(List<BaseHouse> listOfHouses) {
        this.listOfHouses = listOfHouses;
    }

    public double getTotalPriceOfHouse() {
        return getTotalPriceOfHouseByType(HouseType.HOUSE);
    }

    public double getTotalPriceOfVilla() {
        return getTotalPriceOfHouseByType(HouseType.VILLA);
    }

    public double getTotalPriceOfSummerHouse() {
        return getTotalPriceOfHouseByType(HouseType.SUMMERHOUSE);
    }

    public double getTotalPriceOfHouseByType(HouseType houseType) {
        double priceSummation = 0;

        List<BaseHouse> filteredList = listOfHouses.stream()
                .filter(house -> house.getHomeType() == houseType)
                .toList();

        for (BaseHouse filteredHouse : filteredList) {
                priceSummation = priceSummation +  filteredHouse.getPrice();
        }
        return priceSummation;
    }

    public double getTotalPriceOfAllHouse() {
        double totalPrice = 0;
        for (BaseHouse filteredHouse : listOfHouses) {
            totalPrice += filteredHouse.getPrice();
        }
        return totalPrice;
    }

    public double getAverageAreaOfHouseByType(HouseType houseType) {
        double area = 0;

        List<BaseHouse> filteredList = listOfHouses.stream()
                .filter(house -> house.getHomeType() == houseType)
                .toList();

        for (BaseHouse filteredHouse : listOfHouses) {
                area += filteredHouse.getTotalArea();
        }
        return area / listOfHouses.size();

    }

    public double getAverageAreaOfAllHouse() {
        double area = 0;
        for (BaseHouse filteredHouse : listOfHouses) {
            area += filteredHouse.getTotalArea();
        }
        return area / listOfHouses.size();
    }

    public List<BaseHouse> filterHouseByRoomLivingRoomSelection(int numberOfRooms, int numberOfLivingRooms) {

        List<BaseHouse> filteredHouseList = new ArrayList<>();
        for (BaseHouse baseHouse : listOfHouses) {
            if (baseHouse.getNumberOfRooms() == numberOfRooms && baseHouse.getNumberOfLivingRooms() == numberOfLivingRooms) {
                filteredHouseList.add(baseHouse);
            }
        }
        return filteredHouseList;

    }
}
