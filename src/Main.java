import constants.HouseType;
import entity.BaseHouse;
import entity.House;
import entity.SummerHouse;
import entity.Villa;
import service.Service;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<BaseHouse> baseHouseList = getBaseHouses();
        Service service = new Service();
        service.setListOfHouses(baseHouseList);

        System.out.println("Total price of all types of houses: " + service.getTotalPriceOfAllHouse());
        System.out.println("Total price of all houses: " + service.getTotalPriceOfHouse());
        System.out.println("Total price of all villas: " + service.getTotalPriceOfVilla());
        System.out.println("Total price of all summer houses: " + service.getTotalPriceOfSummerHouse());
        System.out.println("Average area of all types of houses: " + service.getAverageAreaOfAllHouse());
        System.out.println("Average area of all houses: " + service.getAverageAreaOfHouseByType(HouseType.HOUSE));
        System.out.println("Average area of all villas: " + service.getAverageAreaOfHouseByType(HouseType.VILLA));
        System.out.println("Average area of all summer houses: " + service.getAverageAreaOfHouseByType(HouseType.SUMMERHOUSE));
        System.out.println("Houses with 4 rooms and 1 living room: " + service.filterHouseByRoomLivingRoomSelection(4, 1).toString());
    }

    private static List<BaseHouse> getBaseHouses() {  //Generates a list which consists of 3 houses, 3 summer houses and 3 villas.
        BaseHouse firstHouse = new House(200, 50000, 4, 1);
        BaseHouse secondHouse = new House(150, 35000, 1, 1);
        BaseHouse thirdHouse = new House(175,45000, 2, 1);
        BaseHouse firstSummerHouse = new SummerHouse(50000, 32000, 4, 2);
        BaseHouse secondSummerHouse = new SummerHouse(90000, 38000, 4, 1);
        BaseHouse thirdSummerHouse = new SummerHouse(110000, 50000, 5, 3);
        BaseHouse firstVilla = new Villa(700, 250000, 4, 2);
        BaseHouse secondVilla = new Villa(950, 300000, 7, 3);
        BaseHouse thirdVilla = new Villa(1000, 350000, 8, 3);

        return List.of(firstHouse, secondHouse, thirdHouse, firstSummerHouse, secondSummerHouse, thirdSummerHouse, firstVilla, secondVilla, thirdVilla);
    }
}
