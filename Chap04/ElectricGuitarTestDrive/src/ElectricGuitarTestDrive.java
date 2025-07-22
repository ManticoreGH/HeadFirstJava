public class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.setBrand("Fender");
        guitar.setNumberOfPickups(3);
        guitar.setRockStarUsesIt(true);

        System.out.println("Brand: " + guitar.getBrand());
        System.out.println("Number of Pickups: " + guitar.getNumberOfPickups());
        System.out.println("Rock Star Uses It: " + guitar.getRockStarUsesIt());
    }
}
