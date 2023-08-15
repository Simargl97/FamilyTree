package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class sortDateOfBirth extends Command {


    public sortDateOfBirth(ConsoleUI consoleUI) {
        super("Отсортировать людей по дате рождения", consoleUI);
    }



    @Override
    public void execute(String path) {
        super.getConsoleUI().sortDateOfBirth();
    }

    @Override
    public void execute() {

    }
}
