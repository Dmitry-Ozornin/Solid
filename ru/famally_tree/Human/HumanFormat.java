package ru.famally_tree.Human;

public class HumanFormat {
    private Human human;

    private String getSpouseInfo(){
        return "spouse: " + (human.getSpouse() != null ? human.getSpouse().getName() : "no");
    }

    public HumanFormat(Human human) {
        this.human = human;
    }

    private String getFatherInfo(){
        return "father: " + (human.getFather() != null ? human.getFather().getName() : "no");
    }

    private String getMotherInfo(){
        return "mother: " + (human.getMother() != null ? human.getMother().getName() : "no");
    }



    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(human.getId());
        sb.append(", name: ");
        sb.append(human.getName());
        sb.append(", gender: ");
        sb.append(human.getGender());
        sb.append(", age: ");
        sb.append(human.getAge());
        sb.append(", ");
        sb.append(getSpouseInfo());
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return  sb.toString();
    }

    private String getChildrenInfo(){
        StringBuilder child = new StringBuilder("children: ");
        if(!human.getChildren().isEmpty()){
            child.append(human.getChildren().get(0).getName());
            for(int i = 1; i < human.getChildren().size(); i++){
                child.append(", ");
                child.append(human.getChildren().get(i).getName());
            }
        } else {
            child.append("no");
        }
        return child.toString();
    }


}
