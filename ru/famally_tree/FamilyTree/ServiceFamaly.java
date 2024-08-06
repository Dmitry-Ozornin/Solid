package ru.famally_tree.FamilyTree;

import ru.famally_tree.Filehandler.FileHandler;
import ru.famally_tree.Filehandler.Writer;
import ru.famally_tree.Human.Gender;
import ru.famally_tree.Human.Human;
import ru.famally_tree.Human.HumanBuilder;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

public class ServiceFamaly {
    private FamilyTree<Human> familyTree;
    private HumanBuilder humanBuilder;
    private Writer fileHandler;

    public ServiceFamaly() {
        familyTree = new FamilyTree<>();
        humanBuilder = new HumanBuilder();
        fileHandler = new FileHandler();
    }

    public void addHumans(String name, Gender gender, LocalDate birth, LocalDate dead, Human father, Human mother, Human spouse) {
        Human human = humanBuilder.build(name, gender, birth,dead, father, mother,spouse);
        familyTree.addHumans(human);

    }

    public void addHumans(String name, Gender gender, LocalDate birth) {
        Human human = humanBuilder.build(name, gender, birth);
        familyTree.addHumans(human);
    }

    public void addHumans(String name, Gender gender, LocalDate birth, Human mother, Human father) {
        Human human = humanBuilder.build(name, gender, birth, mother, father);
        familyTree.addHumans(human);
    }

    public String getHumanList(){
        return familyTree.info();
    }



    @Override
    public String toString() {
        return info();
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Древо: ");

        sb.append(" людей: \n");
        for (Human human : familyTree) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();

    }

    public void sortByAge(){
        familyTree.sortByAge();
    }

    public void sortByName(){
        familyTree.sortByName();
    }

    public void saveFamaly(){
        fileHandler.save(familyTree);
    }
    public void readFamaly(){
        if(fileHandler.read() !=null) {
            familyTree = (FamilyTree) fileHandler.read();
        }
    }


    public String nameFind(String name){
        StringBuilder stringBuilder = new StringBuilder();
        List<Human> humanFound = familyTree.getByName(name);
        for(Human human: humanFound) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public List<Integer> foundHumanId (String name){
        List<Human> foundHuman = familyTree.getByName(name);
        List<Integer> foundHumanId = new ArrayList<>();
        for (Human human: foundHuman){
            foundHumanId.add(human.getId());
        }
        return foundHumanId;
    }

    public void removeHuman(int id){
        familyTree.remove(id);
    }

}