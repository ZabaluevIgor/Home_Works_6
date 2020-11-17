package Home_Work_6;

public class Cat extends Animals {

    private static String name = "Барсик";
    private static int runMAX = 200;
    private static int swimMAX = 0;
    private static float jumpMAX = 0.5f;

    protected String getName() {
        return name;
    }

    protected int getRunMAX() {
        return runMAX;
    }

    protected int getSwimMAX() {
        return swimMAX;
    }

    protected float getJumpMAX() {
        return jumpMAX;
    }

}
