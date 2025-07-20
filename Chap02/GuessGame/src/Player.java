public class Player {
    int number;

    public void guess() {
        // Simulate a player's guess by generating a random number
        this.number = (int) (Math.random() * 10);
    }
}
