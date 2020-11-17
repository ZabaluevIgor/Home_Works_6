package Home_Work_6;

public class Dog extends Animals {

    private static String name = "Бобик";
    private static int runMAX = 500;
    private static int swimMAX = 10;
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
















//    public Dog(String name, int run, int swim, int jump) {
//        super(name, run, swim, jump);
//    }

