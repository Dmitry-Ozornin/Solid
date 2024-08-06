package ru.famally_tree.Human;

import java.io.Serializable;
import java.time.LocalDate;

public class HumanBuilder implements Serializable {
    private String name;
    private Gender gender;
    private LocalDate birth;
    private LocalDate dead;
    private Human father;
    private Human mother;
    private Human spouse;

    public Human build(String name, Gender gender, LocalDate birth, LocalDate dead, Human father, Human mother, Human spouse){
        return new Human( name, gender,birth,dead,father,mother,spouse);

    }

    public Human build(String name, Gender gender, LocalDate birth){
        return new Human(name,gender,birth);
    }
    public Human build(String name, Gender gender, LocalDate birth, Human father, Human mother){
        return new Human(name,gender,birth,mother,father);
    }

}
