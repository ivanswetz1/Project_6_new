package org.example.project_6_new.Part_1;

public class Part_1_main {
    public static void main(String[] args) {
        Person Mykola = new Person(1999);
        Person Ivan = new Person(2005);
        Person Oleg = new Person(1998);
        Person Andriy = new Person(2011);
        Person Petro = new Person(2000);
        Person Vasyl = new Person(2000);
        System.out.println(Mykola.compareTo(Ivan));
        System.out.println(Oleg.compareTo(Andriy));
        System.out.println(Petro.compareTo(Mykola));
        System.out.println(Petro.compareTo(Vasyl));
    }
}
