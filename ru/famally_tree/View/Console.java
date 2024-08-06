package ru.famally_tree.View;



import ru.famally_tree.Human.Gender;
import ru.famally_tree.Presenter.Presenter;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Console implements View{

    private boolean work;
    private Menu menu;
    private Presenter presenter;
    private Input input;

    public Console() {
        work = true;
        Scanner scanner = new Scanner(System.in);
        menu = new Menu(this);
        presenter = new Presenter(this);
        input = new Input(scanner);
    }



    public  void greeting(){
        System.out.println("Добро пожаловать. Выберите нужный пункт для работы с семейным древом");
    }

    private void selectItemMenu(){
        while(work){
            System.out.println(menu.getMenu());
            String choicestr = input.getInput();
            if(input.menuChoiceIsValid(choicestr, menu.size())){
                int choice = Integer.parseInt(choicestr);
                menu.execute(choice);
            }else {
                System.out.println("Вы ввели несуществующий пункт, введите номер из меню");
            }
        }
    }



    @Override
    public void start() {
        greeting();
        presenter.readFamaly();
        selectItemMenu();

    }

    public void finishWork(){
        work = false;
        System.out.println("До свидания!");
        presenter.saveFamily();
    }

    public void sortByName(){
        presenter.sortByName();
    }
    public void sortByAge(){
        presenter.sortByAge();
    }

    public void addHuman(){
        System.out.println(" Укажите имя человека:");
        String name = input.getInput();
        System.out.println("Укажите пол Male(мужчина) или Famale(женщина)");
        String genderStr = input.getInput();
        System.out.println("Укажите дату рождения через пробел в формате ГОД Месяц день");
        LocalDate birthData = input.getBirthInput();


        presenter.addHumans(name, Gender.valueOf(genderStr),birthData);
    }

    public void getHumanListInfo(){
        presenter.getHumanList();
    }

    public void findName(){
        System.out.println(" Укажите имя человека:");
        String name = input.getInput();
        printFoundHuman(name);

    }

    public void printFoundHuman(String name){
        String foundHuman = presenter.findName(name);
        if(foundHuman.isEmpty()){
            System.out.println("Не найдено");
        } else {
            System.out.println("Найдено: ");
            System.out.println(foundHuman);
        }
    }

    public void removeHuman(){
        System.out.println("Укажите имя человека, которого хотите удалить");
        String name = input.getInput();
        printFoundHuman(name);
        List<Integer> foundHumanId = presenter.foundHumanId(name);
        if(!foundHumanId.isEmpty()){
            removeHumanById(name, foundHumanId);
        }
    }

    public void removeHumanById(String name, List<Integer> foundHumanId){
        System.out.println("Укажите ID человека , которого необходимо удалить");
        boolean flag = true;
        while (flag){
            String idStr = input.getInput();
            if(input.idChoiceIsValid(idStr, foundHumanId)){
                int id = Integer.parseInt(idStr);
                presenter.remove(id);
                flag = false;
            } else {
                System.out.println("Введен неверный ID, введите ID из списка" + foundHumanId);
            }

        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}

