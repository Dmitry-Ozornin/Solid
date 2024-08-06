package ru.study.group;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }


    public void addStudent(String name, int age) {
        service.addStudent(name,age);
        getStudentListinfo();
    }

    public void getStudentListinfo() {
        String answer = service.getStudentsListInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();;
        getStudentListinfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentListinfo();
    }
}
