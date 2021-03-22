package Homework1;

public class Human implements CanRun, CanJump{

    private String name;
    private int jumpLength;
    private int runDistance;
    private boolean member = true;

    @Override
    public void jump(int wallHeight) {
        if (jumpLength >= wallHeight){
            System.out.println("Человек прыгает");
        } else {
            System.out.println("Человек не смог прыгнуть");
            member = false;
        }
    }

    @Override
    public void run(int roadLenght) {
        if (runDistance >= roadLenght){
            System.out.println("Человек бежит");
        } else {
            System.out.println("Человек не смог пробежать");
            member = false;
        }
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public Human setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
        return this;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public Human setRunDistance(int runDistance) {
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
