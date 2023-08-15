package FamilyTree.Fam.Tree.view;


import FamilyTree.Fam.Tree.model.HumanGroup.Service;
import FamilyTree.Fam.Tree.presenter.Presenter;

public interface View {

    void start(String path, Service service, Presenter presenter);
    void printAnswer(String answer);


}
