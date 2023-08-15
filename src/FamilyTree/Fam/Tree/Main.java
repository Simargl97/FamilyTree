package FamilyTree.Fam.Tree;


import FamilyTree.Fam.Tree.model.HumanGroup.Service;
import FamilyTree.Fam.Tree.presenter.Presenter;
import FamilyTree.Fam.Tree.view.ConsoleUI;
import FamilyTree.Fam.Tree.view.View;


public class Main {



    private static String path;
    public static void main(String[] args)  {

        View view = new ConsoleUI();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);


        view.start(path, service,presenter);
    }

}