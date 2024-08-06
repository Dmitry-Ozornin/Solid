package ru.famally_tree.View;

import ru.study.group.Presenter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput(){
        return scanner.nextLine();
    }

    public LocalDate getBirthInput(){
        while(true){
            String input = scanner.nextLine().trim();
            try{
                String[] part = input.split(" ");
                int year = Integer.parseInt(part[0]);
                int month = Integer.parseInt(part[1]);
                int day = Integer.parseInt(part[2]);
                LocalDate birth = LocalDate.of(year,month,day);
                if(birth.isAfter(LocalDate.now())){
                    System.out.println("Человек не может родиться будущей датой.Введите правильную дату рождения");
                } else {
                    return birth;
                }
            } catch (DateTimeException|NumberFormatException|ArithmeticException e){
                System.out.println("Неверный ввод, введите в формате Год, Месяц, День");
            }
        }
    }

    public boolean menuChoiceIsValid (String chooseStr, int menuSize ){
        try{
            int choice = Integer.parseInt(chooseStr);
            return choice >= 1 && choice <= menuSize;
        }catch (NumberFormatException e){
            return false;
        }

    }

    boolean idChoiceIsValid(String idStr, List<Integer> foundHumanId){
        try{
            int id = Integer.parseInt(idStr);
            return id >= 1 && foundHumanId.contains(id);

        }catch (NumberFormatException e){
            return false;
        }
    }

}
