package Homework3;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> fruitsList;

    public Box(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }
    public float getWeight(){
        if (fruitsList.size() != 0) return fruitsList.size() * fruitsList.get(0).getWeight();
        else return 0;
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void pourOver(Box<T> box){
        box.getFruitsList().addAll(fruitsList);
        fruitsList.clear();
    }

    public void addFruit(Fruit fruit){
        fruitsList.add((T) fruit);
    }
}
