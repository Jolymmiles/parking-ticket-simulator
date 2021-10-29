public class PoliceOfficer {
    private String officerName;
    private String officerToken;

    public PoliceOfficer(String officerName, String officerToken) {
        this.officerName = officerName;
        this.officerToken = officerToken;
    }

    public ParkingTicket createFine(ParkedCar car, ParkingMeter meter, PoliceOfficer officer) {
        int timesOnCar = car.getCarMinutesOnParking();
        int timesOnMeter = meter.getBoughtMinutes();
        int expiryTime = timesOnCar - timesOnMeter;
        return new ParkingTicket(car, officer, expiryTime);
    }

    public String toString() {
        return "\nОфицер полиции:" +
                "\nИмя: " + officerName+
                "\nЖетон: " + officerToken;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerToken() {
        return officerToken;
    }

    public void setOfficerToken(String officerToken) {
        this.officerToken = officerToken;
    }
}
