package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class sortName extends Command {

    public sortName(ConsoleUI consoleUI) {
        super("Отсортировать людей по имени", consoleUI);
    }

    @Override
    public void execute(String path){super.getConsoleUI().sortDateOfBirth();
    }

    @Override
    public void execute() {

    }
}