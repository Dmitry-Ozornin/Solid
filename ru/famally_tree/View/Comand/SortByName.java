package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class SortByName extends Command{

    public SortByName(Console console){
        super("Отсортировать людей в древе по имени", console);
    }

    @Override
    public void execute() {
        getConsole().sortByName();
        getConsole().getHumanListInfo();
    }
}
