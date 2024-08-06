package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class SortByBirth extends Command{

    public SortByBirth(Console console){
        super("Отсортировать людей во возрасту", console);
    }

    @Override
    public void execute() {
        getConsole().sortByAge();
        getConsole().getHumanListInfo();
    }
}
