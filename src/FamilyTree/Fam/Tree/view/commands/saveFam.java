package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class saveFam extends Command {
    public saveFam(ConsoleUI ConsoleUI) {

        super("Семейное древо сохранено", ConsoleUI);
    }

    @Override
    public void execute(String path) {
        super.getConsoleUI().saveFam(path);
    }

    @Override
    public void execute() {

    }


}