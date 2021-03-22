package Homework1;

public class Cat implements CanRun, CanJump{
    private String name;
    private int jumpLength;
    private int runDistance;
    private boolean member = true;

    @Override
    public void run(int roadLength) {
        if (runDistance>= roadLength){
            System.out.println("Кот бежит");
        } else {
            System.out.println("Кот не смог пробежать");
            member = false;
        }
    }


    @Override
    public void jump(int wallHeight) {
        if (jumpLength >= wallHeight){
            System.out.println("Кот прыгает");
        } else {
            System.out.println("Кот не смог прыгнуть");
            member = false;
        }

    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public Cat setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
        return this;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public Cat setRunDistance(int runDistance) {
        this.runDistance = runDistance;
        return this;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
}
