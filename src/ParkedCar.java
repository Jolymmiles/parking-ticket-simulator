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

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarNumberplate() {
        return carNumberplate;
    }

    public void setCarNumberplate(String carNumberplate) {
        this.carNumberplate = carNumberplate;
    }

    public void setCarMinutesOnParking(int carMinutesOnParking) {
        this.carMinutesOnParking = carMinutesOnParking;
    }
}
