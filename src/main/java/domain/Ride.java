package domain;

/**
 * Created by Mohammad on 11-3-2017.
 */
public class Ride {
    private Station from;
    private Station to;
    private int hoursTravelled;

    public Ride(Station from, Station to, int hoursTravelled) {
        this.from = from;
        this.to = to;
        this.hoursTravelled = hoursTravelled;
    }

    public Station getFrom() {
        return from;
    }

    public void setFrom(Station from) {
        this.from = from;
    }

    public Station getTo() {
        return to;
    }

    public void setTo(Station to) {
        this.to = to;
    }

    public int getHoursTravelled() {
        return hoursTravelled;
    }

    public void setHoursTravelled(int hoursTravelled) {
        this.hoursTravelled = hoursTravelled;
    }
}
