public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand) {
        this(brand,null, 0, null, null, 0.0);
    }

    public Car(String brand, String model) {
        this(brand, model, 0, null, null, 0.0);
    }

    public Car(String brand, String model, int productionYear) {
        this(brand, model, productionYear, null, null, 0.0);
    }

    public Car(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry, null, 0.0);
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color) {
        this(brand, model, productionYear, productionCountry, color, 0.0);
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.equals("")) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0.0 ) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;

        }
    }

    public void printingData() {
        System.out.println(this.brand + " " + this.model + ", " + this.productionYear + " года выпуска, сборка в "
                + this.productionCountry + ", " + this.color + " цвета, объём двигателя - " + this.engineVolume);
    }
}
