package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class RemoveHuman extends Command{

    public RemoveHuman(Console console){
        super("Удалить человека из древа", console);

    }

    @Override
    public void execute() {
        getConsole().removeHuman();
    }
}
