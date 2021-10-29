public class ParkingMeter {
    private int boughtMinutes;

    public ParkingMeter(int boughtMinutes) {
        this.boughtMinutes = boughtMinutes;
    }

    public int getBoughtMinutes() {
        return this.boughtMinutes;
    }

    public void setBoughtMinutes(int boughtMinutes) {
        this.boughtMinutes = boughtMinutes;
    }
}
