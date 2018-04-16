package controllers;

import domain.Ride;
import domain.Station;
import domain.Train;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/train")
public class TrainController {

    ArrayList<Station> allStations = new ArrayList<Station>();
    public TrainController () {

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
    }

    /**
     * Haalt het totale aantal ritjes op die gereden zijn door treinen die gestationeerd zijn in een station.
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getTotalRides/{station}")
    public int getTotalRides(@PathParam("station") String station) throws Exception {
        Station foundStation = findStation(station);
        if(foundStation != null) {
            return foundStation.getTotalRides();
        } else {
            throw new Exception("Geen station gevonden");
        }
    }


    /**
     * Haalt totale energie op voor een station
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getTotalEnergyConsumption/{station}")
    public int getTotalEnergyConsumption(@PathParam("station") String station) throws Exception {
        Station foundStation = findStation(station);
        if(foundStation != null) {
            return foundStation.getTotalEnergyConsumption();
        } else {
            throw new Exception("Geen station gevonden");
        }
    }

    /**
     * Haalt totale energie consumptie op per uur voor een station
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getTotalEnergyConsumptionPerHour/{station}")
    public int getTotalEnergyConsumptionPerHour(@PathParam("station") String station) throws Exception {
        Station foundStation = findStation(station);
        if(foundStation != null) {
            return foundStation.getTotalEnergyConsumptionPerHour();
        } else {
            throw new Exception("Geen station gevonden");
        }
    }

    /**
     * Haalt totale energie consumptie op voor het aantal uren dat opgegeven is voor een station
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getTotalEnergyConsumptionHour/{station}/{hours}")
    public int getTotalEnergyConsumptionHour(@PathParam("station") String station, @PathParam("hours") int hours) throws Exception {
        Station foundStation = findStation(station);
        if(foundStation != null) {
            return foundStation.getTotalEnergyConsumptionHours(hours);
        } else {
            throw new Exception("Geen station gevonden");
        }
    }

    /**
     * Haalt alle ritjes op die gereden zijn door treinen die gestationeerd zijn in een station.
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getAllRides/{station}")
    public String getAllRides(@PathParam("station") String station) throws Exception {
        Station foundStation = findStation(station);
        String allRides = new String();
        if(foundStation != null) {
            for(String ride: foundStation.getAllRides()) {
                allRides += ride + "\n";
            }
        } else {
            throw new Exception("Geen station gevonden");
        }

        return allRides;
    }

    /**
     * Haalt alle gestationeerde treins op van een station.
     * @param station
     * @return
     * @throws Exception
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getStationedTrains/{station}")
    public String getStationedTrains(@PathParam("station") String station) throws Exception {
        Station foundStation = findStation(station);
        String allStationedTrains = new String();
        if(foundStation != null) {
            for(Train train: foundStation.getStationedTrains()) {
                allStationedTrains += train.name + "\n";
            }
        } else {
            throw new Exception("Geen station gevonden");
        }
        return allStationedTrains;
    }

    /**
     * Find the station in the ArrayList
     * @param name
     * @return
     */
    private Station findStation(String name) {
        for(Station station : this.allStations) {
            if(station.equals(name)) {
                return station;
            }
        }
        return null;
    }

}
