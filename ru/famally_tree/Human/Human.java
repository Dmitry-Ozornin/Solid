package ru.famally_tree.Human;

import ru.famally_tree.FamilyTree.ItemFamalyTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public  class Human implements Comparable<Human>, ItemFamalyTree<Human> {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birth;
    private LocalDate dead;
    private Human father;
    private Human mother;
    private List<Human> children;
    private Human spouse;
    private HumanAdd humanAdd;

    public Human(String name, Gender gender, LocalDate birth,LocalDate dead,Human father,Human mother,Human spouse){
        id = -1;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.dead = dead;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
        this.spouse = spouse;
        this.humanAdd = new HumanAdd(this);

    }

    public Human(String name, Gender gender, LocalDate birth){
        this(name,gender,birth,null,null,null,null);
    }

    public Human(String name, Gender gender, LocalDate birth, Human mother, Human father){
        this(name, gender,birth,null,father,mother,null);
    }

    public boolean addChildren(Human child){
        return humanAdd.addChildren(child);
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }


    public boolean addParent(Human parent){
        return humanAdd.addParent(parent);
    }





    public void setGender(Gender gender){
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFather(Human father){
        this.father = father;
    }

    public void setMother(Human mother){
        this.mother = mother;
    }

    public Human getFather(){
        return father;
    }
    public Human getMother(){
        return mother;
    }

    public List<Human> getParents(){
        return humanAdd.getParents();
    }

    public int getAge(){
        if(dead == null){
            return getPeriod(birth, LocalDate.now());
        }else{
            return getPeriod(birth, dead);
        }
    }


    public int getPeriod(LocalDate birth, LocalDate dead){
        Period diff = Period.between(birth,dead);
        return diff.getYears();
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }
    public Human getSpouse(){
        return spouse;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public LocalDate  getBirth(){
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public LocalDate getDead(){
        return dead;
    }

    public void setDead(LocalDate dead) {
        this.dead = dead;
    }

    public List<Human> getChildren(){
        return children;
    }

    public void setBirth(){
        this.birth = birth;
    }

    public void setDead(){
        this.dead = dead;
    }

    public Gender getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return new HumanFormat(this).getInfo();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Human)){
            return false;
        }
        Human human =(Human) obj;
        return human.getId() == getId();
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}