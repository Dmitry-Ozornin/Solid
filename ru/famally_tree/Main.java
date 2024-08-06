package ru.famally_tree;

import ru.famally_tree.FamilyTree.ServiceFamaly;
import ru.famally_tree.Human.Gender;
import ru.famally_tree.View.Console;
import ru.famally_tree.View.View;

import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        View view = new Console();
        view.start();
    }
//        ServiceFamaly serviceFamaly = getServiceFamaly();
//
//        System.out.println(serviceFamaly.info());
//
////        serviceFamaly.saveFamaly();
////        serviceFamaly.readFamaly();
////        System.out.println("Сохрарены данные\n" + serviceFamaly);
////
////        serviceFamaly.sortByAge();
////        System.out.println(serviceFamaly);
////
////        serviceFamaly.sortByName();
////        System.out.println(serviceFamaly);
//
//
//
//
//
//
//
////        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tree.out"));
////        out.writeObject(tree);
////        out.close();
//
////        FileInputStream fileInputStream = new FileInputStream("Tree.out");
////        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
////        FamilyTree tree2 = (FamilyTree) objectInputStream.readObject();
////
////        System.out.println(tree2);
//
//
//    }
//
//    private static ServiceFamaly getServiceFamaly() {
//        ServiceFamaly serviceFamaly = new ServiceFamaly();
////
//
//        serviceFamaly.addHumans("Игорь", Gender.Male, LocalDate.of(1900, 9, 10), LocalDate.of(1970,9,12),null,null,null);
//        serviceFamaly.addHumans("Лена", Gender.Famale, LocalDate.of(1905, 11, 11),LocalDate.of(1973,12,11),null,null,null);
//        serviceFamaly.addHumans("Настя", Gender.Famale, LocalDate.of(1930, 12, 15),LocalDate.of(2010,11,17),null, null,null);
//
//        serviceFamaly.addHumans("Лариса", Gender.Famale, LocalDate.of(1840, 03, 22),null,null,null,null);
//
//        return serviceFamaly;
//    }



}
