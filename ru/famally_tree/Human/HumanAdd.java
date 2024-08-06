package ru.famally_tree.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HumanAdd implements Serializable {
    private Human human;

    public HumanAdd(Human human) {
        this.human = human;
    }

    public boolean addChildren(Human child){
        if(!human.getChildren().contains(child)){
            human.getChildren().add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent){
        if(parent.getGender().equals(Gender.Male)){
            human.setFather(parent);
        } else if(parent.getGender().equals(Gender.Famale)){
            human.setMother(parent);
        }
        return true;
    }
    public List<Human> getParents(){
        List<Human> list = new ArrayList<>();
        if(human.getFather() != null){
            list.add(human.getFather());
        }
        if (human.getMother() != null){
            list.add(human.getMother());
        }
        return list;
    }
}
