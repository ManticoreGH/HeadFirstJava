public class Player {
    static int playerCount = 0;
    private String name;
    public Player(String n){
        this.name = n;
        playerCount++;
    }
}
