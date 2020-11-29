package ru.mirea.lab7;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> vaze = new ArrayList<String>();
        vaze.add("яблоко");
        vaze.add("грушу");

        for(String t : vaze) System.out.println(t);

        LinkedList<String> states = new LinkedList<String>();
        states.add("Германия");
        states.add("Россия");
        states.add("Poland");
        states.addFirst("Great Britain");
        states.addLast("Вьетнам");
        states.add(1, "China");
        for (int i = 0; i < states.size(); i++)
            System.out.println(states.get(i));
        states.remove(1);
        System.out.println("///////////////\n");


        if (states.contains("Вьетнам")) System.out.println("Есть такое государство");
        states.remove(0);
        states.remove("Poland");

        for (String p : states) {
            System.out.println(p);

        }
        LinkedList<Person> friends = new LinkedList<Person>();
        friends.add(new Person("Stepan"));
        friends.add(1, new Person("Mike"));
        friends.addFirst(new Person("Tom"));
        friends.addLast(new Person("Nick"));


    for(Person p : friends) System.out.println(p);
    friends.remove(1);
    for(Person p : friends) System.out.println(p);
    Person tmp = friends.getFirst();
    System.out.println(tmp);
    }
}