package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class sortPatronymic extends Command {

    public sortPatronymic(ConsoleUI consoleUI) {
        super("Отсортировать людей по отчеству", consoleUI);
    }

    @Override
    public void execute(String path) {
        super.getConsoleUI().sortPatronymic();
    }

    @Override
    public void execute() {

    }
}
