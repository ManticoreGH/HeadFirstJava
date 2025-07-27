public class MonsterTestDrive {
    public static void main(String[] args) throws Exception {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}

class Monster {
    // Monster class implementation
    boolean frighten(int degree) {
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster {
    // Vampire class implementation
    boolean frighten(int degree) {
        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster {
    // Dragon class implementation
    boolean frighten(int degree) {
        System.out.println("Breathe fire");
        return true;
    }
}
