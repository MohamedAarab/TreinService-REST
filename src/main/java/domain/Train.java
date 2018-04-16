package domain;

import java.util.ArrayList;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Train {
    public String name;
    private ArrayList<Ride> rides;
    private int powerPerHour;

    public Train(String name, int powerPerHour) {
        this.name = name;
        this.powerPerHour = powerPerHour;
        this.rides = new ArrayList<Ride>();
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {
        this.rides.add(ride);
    }

    public int getPowerPerHour() {
        return powerPerHour;
    }

    public int calculateEnergyUsage() {
        int totalEnergy = 0;
        for (Ride ride : rides) {
            totalEnergy += (this.powerPerHour * ride.getHoursTravelled());
        }
        return totalEnergy;
    }
}
