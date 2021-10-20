public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private int expiryTime;
    private int FINE = 25;



    public ParkingTicket(ParkedCar car,  PoliceOfficer officer,  int expiryTime) {
        this.car =  car;
        this.expiryTime = expiryTime;
        this.officer = officer;
    }


    public String toString() {
        return "          Штраф:\n" +
                "----------------------\n" +
                car +
                "\n----------------------" +
                "\nЛицо вынесшее штраф: " + officer +
                "\nСумма штрафа:" + getFine() + "$";
    }


    private double getFine(){
        double pay;
        double time = this.expiryTime;
        pay = 25 + (time/60 > 1 ? 10 * Math.ceil(time / 60 - 1) :0) ;
        return pay;
        }
    }



