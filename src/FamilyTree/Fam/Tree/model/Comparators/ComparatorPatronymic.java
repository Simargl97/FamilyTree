package FamilyTree.Fam.Tree.model.Comparators;


import FamilyTree.Fam.Tree.model.HumanGroup.HumanGroupItem;


import java.util.Comparator;

public class ComparatorPatronymic<E extends HumanGroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getPatronymic().compareTo(o2.getPatronymic());
    }
}
