package Home_Work_6;

public abstract class Animals {

 /*   Не успел реализовать свой метод выполнения, т.к. не до конца понял тему,
 но в процессе выполнения задания по Вашему варианту, изложенной в начале 7 урока,
 понял как это все работает, как происходит наследование и т.д.!!! Спасибо большое!!!
 */
    protected abstract String getName();
    protected abstract int getRunMAX();
    protected abstract int getSwimMAX();
    protected abstract float getJumpMAX();

    public void run(int distance) {
        boolean result = (distance <= getRunMAX());
            System.out.println(getName() + " пробежал " + distance + " метров." + result);
    }

    public void swim(int distance) {
        boolean result = (distance <= getSwimMAX());
            System.out.println(getName() + " проплыл " + distance + " метров." + result);
    }

    public void jump(float height) {
        boolean result = (height <= getJumpMAX());
            System.out.println(getName() + " прыгнул на " + height + " метров." + result);
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(800);
        dog.swim(5);
        cat.run(50);
        cat.jump(0.3f);

    }

//    protected int run;
//    protected int swim;
//    protected float jump;
//
//    public Animals(int run, int swim, float jump) {
//
//        this.run = run;
//        this.swim = swim;
//        this.jump = jump;
//    }

}

