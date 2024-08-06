package ru.famally_tree.Presenter;

import ru.famally_tree.FamilyTree.ServiceFamaly;
import ru.famally_tree.Human.Gender;
import ru.famally_tree.Human.Human;
import ru.famally_tree.View.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {

    private View view;
    private ServiceFamaly serviceFamaly;

    public Presenter(View view) {
        this.view = view;
        serviceFamaly = new ServiceFamaly();
    }



    public void addHumans(String name, Gender gender, LocalDate birth) {
        serviceFamaly.addHumans(name,gender,birth);
        getHumanList();
    }

    public void addHumans(String name, Gender gender, LocalDate birth, Human mother, Human father) {
        serviceFamaly.addHumans(name,gender,birth,father,mother);
        getHumanList();
    }

    public void getHumanList(){
        String answer = serviceFamaly.getHumanList();
        view.printAnswer(answer);
    }

    public void sortByName(){
        serviceFamaly.sortByName();

    }
    public void sortByAge(){
        serviceFamaly.sortByAge();
    }

    public void saveFamily(){
        serviceFamaly.saveFamaly();
    }

    public void readFamaly(){
        serviceFamaly.readFamaly();
    }

    public String findName(String name){
        return serviceFamaly.nameFind(name);
    }

    public List<Integer> foundHumanId(String name){
        return serviceFamaly.foundHumanId(name);
    }

    public void remove(int id){
        serviceFamaly.removeHuman(id);
    }



}
