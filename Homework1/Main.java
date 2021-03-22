package Homework1;

public class Main {
    public static void main(String[] arg){
        Cat cat = new Cat();
        cat.setName("Snow").setJumpLength(3).setRunDistance(150);
        Robot robot = new Robot();
        robot.setName("0111001").setJumpLength(8).setRunDistance(1500);
        Human human = new Human();
        human.setName("Boris").setJumpLength(3).setRunDistance(600);

        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(1);
        Road road1 = new Road(100);
        Road road2 = new Road(180);

        Object[] team =  new Object[]{robot, human, cat};
        Object[] course = new Object[]{road1, wall1, road2, wall2};

        for (int i = 0; i > team.length; i++){
            for (int j = 0; j > course.length; j++){
                if (team[i].isMember = true) {    
                    course[j].check(team[i]);
                } else break;
            }
        }


    }
}
