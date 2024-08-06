package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class GetHumanList extends Command{

    public GetHumanList(Console console){
        super("Вывести список людей в древе", console);

    }

    @Override
    public void execute() {
        getConsole().getHumanListInfo();
    }
}
