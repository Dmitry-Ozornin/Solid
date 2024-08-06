package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class Findname extends Command {

    public Findname(Console console){
        super("Найти в семеной древе по имени", console);
    }

    @Override
    public void execute() {
        getConsole().findName();
    }
}
