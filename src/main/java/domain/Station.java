package domain;

import java.util.ArrayList;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Station {
    private String name;
    private ArrayList<Train> stationedTrains;

    public Station(String name) {
        this.name = name;
        this.stationedTrains = new ArrayList<Train>();
    }

    public String getName() {
        return name;
    }

    public int getTotalEnergyConsumptionPerHour() {
        int totalEnergy = 0;
        for (Train train : stationedTrains) {
            if(!train.getRides().isEmpty())
                totalEnergy += train.getPowerPerHour();
        }
        return totalEnergy;
    }

    public int getTotalEnergyConsumptionHours(int hours) {
        int totalEnergy = 0;
        for (Train train : stationedTrains) {
            if(!train.getRides().isEmpty())
                totalEnergy += train.getPowerPerHour();
        }
        return (totalEnergy * hours);
    }

    public int getTotalEnergyConsumption() {
        int totalEnergy = 0;
        for (Train train : stationedTrains) {
            if(!train.getRides().isEmpty())
                totalEnergy += train.calculateEnergyUsage();
        }
        return totalEnergy;
    }

    public int getTotalRides() {
        int totalRides = 0;
        for(Train train : stationedTrains) {
            totalRides += train.getRides().size();
        }
        return totalRides;
    }

    public ArrayList<String> getAllRides() {
        ArrayList<String> rides = new ArrayList<String>();
        for(Train train : stationedTrains) {
            for(Ride ride : train.getRides()) {
                rides.add(String.format("Trein [%s] heeft een ritje gehad van %s naar %s en duurde %d uurtje(s)", train.name, ride.getFrom().getName(), ride.getTo().getName(), ride.getHoursTravelled()));
            }
        }
        return rides;
    }


    public ArrayList<Train> getStationedTrains() {
        return stationedTrains;
    }

    public void addStationedTrain(Train train) {
        this.stationedTrains.add(train);
    }

    public boolean equals(String name) {
        return (name.equals(this.name));
    }
}
