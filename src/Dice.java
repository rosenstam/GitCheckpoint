import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int rollD6() {
        return ThreadLocalRandom.current().nextInt(1,7);
    }
}
