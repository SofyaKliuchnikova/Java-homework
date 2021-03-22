package Homework1;

public class Road {
    private int roadLenght;

    public Road(int roadLenght) {
        this.roadLenght = roadLenght;
    }

    public void check(CanRun runner){
        runner.run(roadLenght);
    }

}
