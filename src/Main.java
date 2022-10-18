public class Main {
    public static void main(String[] args) {

        Car ladaGrande = new Car("Lada", "Grande", 2015, "России", "желтого", 1.7);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германии", "черного", 3.0);
        Car kiaSportage = new Car("Kia", "Sportage 4 поколение", 2018, "Южнаой Кореи", "красного", 2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южной Кореи", "красного", 1.6);

        ladaGrande.printingData();
        audiA8.printingData();
        bmwZ8.printingData();
        kiaSportage.printingData();
        hyundaiAvante.printingData();
    }
}