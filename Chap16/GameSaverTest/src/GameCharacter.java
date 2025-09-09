import java.io.*;
public class GameCharacter implements  Serializable {
    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String[] getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameCharacter{");
        sb.append("power = ").append(power);
        sb.append(", type = ").append(type);
        sb.append(", weapons = ");
        for (String weapon : weapons) {
            sb.append(weapon).append(", ");
        }
        sb.setLength(sb.length() - 2);  // Remove trailing comma and space
        sb.append('}');
        return sb.toString();
    }
}
