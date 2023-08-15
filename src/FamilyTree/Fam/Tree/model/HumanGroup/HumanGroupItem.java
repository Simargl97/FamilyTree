package FamilyTree.Fam.Tree.model.HumanGroup;

import java.time.LocalDate;

public interface HumanGroupItem<T>{
    String getName();
    LocalDate getDateOfBirth();

    String getPatronymic();

    Comparable<Object> readSave();
}
