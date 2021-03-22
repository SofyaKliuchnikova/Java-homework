package Homework1;

public class Wall {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public void check(CanJump jumper){
       jumper.jump(wallHeight);
    }
}
