public class ParkedCar {
    private String carMark;
    private String carModel;
    private String carColor;
    private String carNumberplate;
    private int carMinutesOnParking;

    public ParkedCar(String carMark, String carModel, String carColor, String carNumberplate, int carMinutesOnParking) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carNumberplate = carNumberplate;
        this.carMinutesOnParking = carMinutesOnParking;
    }

    public int getCarMinutesOnParking() {
        return this.carMinutesOnParking;
    }


    public String toString() {
        return "Информация по машине" +
                "\nМарка: " + carMark +
                "\nМодель: " + carModel +
                "\nЦвет: " + carColor +
                "\nНомер: " + carNumberplate+
                "\nВремя на парковке: " + carMinutesOnParking;
    }
}
