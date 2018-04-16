package domain;

import java.util.ArrayList;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Main {
    public static void main(String[] args){
        System.setProperty("javax.xml.accessExternalDTD", "all");
        System.setProperty("javax.xml.accessExternalSchema", "all");

        ArrayList<Station> allStations = new ArrayList<Station>();

        allStations.add(new Station("Utrecht Centraal"));
        allStations.add(new Station("Amsterdam Centraal"));
        allStations.add(new Station("Rotterdam Centraal"));
        allStations.add(new Station("Limburg Centraal"));
        allStations.add(new Station("Brabant Centraal"));
        allStations.add(new Station("Leiden Centraal"));
        allStations.add(new Station("Den Haag Centraal"));

        Train train1 = new Train("C23-1", 5000);
        Train train2 = new Train("C01-2", 6500);
        Train train3 = new Train("C64-1", 3200);
        Train train4 = new Train("C74-8", 4700);
        Train train5 = new Train("C89-0", 9000);
        Train train6 = new Train("C66-3", 3900);
        Train train7 = new Train("C27-5", 5900);
        Train train8 = new Train("C12-1", 6200);
        Train train9 = new Train("C54-9", 4500);
        Train train10 = new Train("C33-2", 8300);


        train1.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train1.addRide(new Ride(allStations.get(1), allStations.get(3), 5));
        train1.addRide(new Ride(allStations.get(2), allStations.get(0), 3));
        train1.addRide(new Ride(allStations.get(0), allStations.get(6), 3));
        train1.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        train2.addRide(new Ride(allStations.get(2), allStations.get(3), 2));
        train2.addRide(new Ride(allStations.get(0), allStations.get(5), 3));
        train2.addRide(new Ride(allStations.get(1), allStations.get(6), 3));
        train2.addRide(new Ride(allStations.get(0), allStations.get(2), 2));
        train2.addRide(new Ride(allStations.get(2), allStations.get(3), 4));

        train3.addRide(new Ride(allStations.get(5), allStations.get(1), 1));
        train3.addRide(new Ride(allStations.get(0), allStations.get(5), 2));
        train3.addRide(new Ride(allStations.get(0), allStations.get(6), 3));
        train3.addRide(new Ride(allStations.get(2), allStations.get(6), 4));
        train3.addRide(new Ride(allStations.get(1), allStations.get(0), 5));

        train4.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train4.addRide(new Ride(allStations.get(0), allStations.get(3), 3));
        train4.addRide(new Ride(allStations.get(4), allStations.get(1), 4));
        train4.addRide(new Ride(allStations.get(3), allStations.get(6), 1));
        train4.addRide(new Ride(allStations.get(2), allStations.get(0), 2));

        train5.addRide(new Ride(allStations.get(0), allStations.get(1), 3));
        train5.addRide(new Ride(allStations.get(1), allStations.get(4), 4));
        train5.addRide(new Ride(allStations.get(2), allStations.get(6), 5));
        train5.addRide(new Ride(allStations.get(0), allStations.get(5), 1));
        train5.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        train6.addRide(new Ride(allStations.get(2), allStations.get(1), 2));
        train6.addRide(new Ride(allStations.get(0), allStations.get(0), 4));
        train6.addRide(new Ride(allStations.get(5), allStations.get(0), 3));
        train6.addRide(new Ride(allStations.get(0), allStations.get(2), 2));
        train6.addRide(new Ride(allStations.get(1), allStations.get(4), 1));

        train7.addRide(new Ride(allStations.get(0), allStations.get(1), 3));
        train7.addRide(new Ride(allStations.get(1), allStations.get(2), 1));
        train7.addRide(new Ride(allStations.get(2), allStations.get(0), 2));
        train7.addRide(new Ride(allStations.get(0), allStations.get(2), 3));
        train7.addRide(new Ride(allStations.get(1), allStations.get(4), 4));

        train8.addRide(new Ride(allStations.get(0), allStations.get(3), 5));
        train8.addRide(new Ride(allStations.get(3), allStations.get(6), 4));
        train8.addRide(new Ride(allStations.get(4), allStations.get(3), 3));
        train8.addRide(new Ride(allStations.get(0), allStations.get(3), 2));
        train8.addRide(new Ride(allStations.get(1), allStations.get(0), 1));

        train9.addRide(new Ride(allStations.get(1), allStations.get(3), 3));
        train9.addRide(new Ride(allStations.get(0), allStations.get(3), 4));
        train9.addRide(new Ride(allStations.get(0), allStations.get(2), 1));
        train9.addRide(new Ride(allStations.get(1), allStations.get(1), 2));
        train9.addRide(new Ride(allStations.get(0), allStations.get(5), 3));

        train10.addRide(new Ride(allStations.get(0), allStations.get(1), 2));
        train10.addRide(new Ride(allStations.get(1), allStations.get(3), 3));
        train10.addRide(new Ride(allStations.get(2), allStations.get(0), 4));
        train10.addRide(new Ride(allStations.get(0), allStations.get(6), 1));
        train10.addRide(new Ride(allStations.get(1), allStations.get(0), 2));

        allStations.get(0).addStationedTrain(train1);
        allStations.get(0).addStationedTrain(train2);
        allStations.get(0).addStationedTrain(train3);
        allStations.get(0).addStationedTrain(train4);
        allStations.get(0).addStationedTrain(train5);
        allStations.get(0).addStationedTrain(train6);
        allStations.get(0).addStationedTrain(train7);
        allStations.get(0).addStationedTrain(train8);
        allStations.get(0).addStationedTrain(train9);
        allStations.get(0).addStationedTrain(train10);

        Station foundStation = null;
        for(Station station : allStations) {
            if(station.equals("Utrecht Centraal")) {
                foundStation = station;
                break;
            }
        }

        System.out.println("Totale ritjes: " + foundStation.getTotalRides());
        System.out.println("Totale energie consumptie: " + foundStation.getTotalEnergyConsumption() + " MegaWatts");
        System.out.println("Totale energie consumptie per uur: " + foundStation.getTotalEnergyConsumptionPerHour()  + " MegaWatts");
        System.out.println("Totale energie consumptie afgelopen 5 uur: " + foundStation.getTotalEnergyConsumptionHours(5)  + " MegaWatts");

        System.out.println("Alle treinen van Utrecht Centraal ritjes: \n");
        for(Train train: foundStation.getStationedTrains()) {
            System.out.println("Trein " + train.name);
        }

        System.out.println("Alle gereden ritjes: \n");
        for(String ride: foundStation.getAllRides()) {
            System.out.println(ride);
        }

    }
}
