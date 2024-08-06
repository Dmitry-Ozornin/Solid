package ru.study.group;

import java.util.Scanner;

public class Console implements View{
    private Scanner scanner;
    private boolean work;
    private Presenter presenter;

    public Console() {
        scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
    }

    @Override
    public void start() {
        System.out.println("Привет");
        while (work){
            System.out.println("1.Добавить студента");
            System.out.println("2.Получить список студентов");
            System.out.println("3.тсортировать по имени");
            System.out.println("4.Отсортировать по возрасту");
            System.out.println("5. Завершение работы");

            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    getStudentListinfo();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByAge();
                    break;
                case "5":
                    finish();
                    break;
                default:
                    System.out.println("Введена неверная команда");
            }
        }

    }

    private void finish() {
        work = false;
        scanner.close();
        System.out.println("Пока");
    }

    private void sortByAge() {
        presenter.sortByAge();
    }

    private void sortByName() {
        presenter.sortByName();
    }

    private void getStudentListinfo() {
        presenter.getStudentListinfo();
    }

    private void addStudent() {
        System.out.println("Укажите имея студента");
        String name = scanner.nextLine();
        System.out.println("Укажите возраст студента");
        String ageStr = scanner.nextLine();
        int age = Integer.parseInt(ageStr);
        presenter.addStudent(name,age);
    }


    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);

    }
}
