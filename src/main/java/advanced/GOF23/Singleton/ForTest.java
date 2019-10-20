package advanced.GOF23.Singleton;

public class ForTest {
    public ForTest() {
    }

    private static ForTest instance = new ForTest();

    public static ForTest getInstance() {
        return instance;
    }
}
