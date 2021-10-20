import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfCar = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < countOfCar; i++) {
            String carMark = sc.nextLine();
            String carModel = sc.nextLine();
            String carColor = sc.nextLine();
            String carNumberplate = sc.nextLine();

            int carMinutesOnParking = Integer.parseInt(sc.nextLine());
            int boughtMinutes = Integer.parseInt(sc.nextLine());

            ParkingMeter meter = new ParkingMeter(boughtMinutes);
            ParkedCar car = new ParkedCar(carMark, carModel, carColor, carNumberplate, carMinutesOnParking);
            PoliceOfficer officer = new PoliceOfficer("Валентин", "123543");
            ParkingTicket ticket = officer.createFine(car, meter, officer);
            System.out.println(ticket);
        }

    }
}
