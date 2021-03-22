package Homework1;

public class Robot implements CanRun, CanJump{

    private String name;
    private int jumpLength;
    private int runDistance;
    private boolean member = true;

    @Override
    public void jump(int wallHeight) {
        if (jumpLength >= wallHeight){
            System.out.println("Робот прыгает");
        } else {
            System.out.println("Робот не смог прыгнуть");
            member = false;
        }
    }

    @Override
    public void run(int roadLength) {
        if (runDistance >= roadLength){
            System.out.println("Робот бежит");
        } else {
            System.out.println("Робот не смог пробежать");
            member = false;
        }
    }

    public String getName() {
        return name;
    }

    public Robot setName(String name) {
        this.name = name;
        return this;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public Robot setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
        return this;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public Robot setRunDistance(int runDistance) {
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
