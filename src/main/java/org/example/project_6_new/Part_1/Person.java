package org.example.project_6_new.Part_1;

public class Person implements Comparable<Person>{
    int birth_year;
    public Person(int birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public int compareTo(Person o) {
        switch (Integer.compare(this.birth_year, o.birth_year)){
            case 1:
                return 1;
            case -1:
                return -1;
            default:
                return 0;
        }
    }
}
