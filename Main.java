package ru.itis.inf304.iterator;

//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
//import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Monkey");
        list.add("Lion");
        list.add("Pinguin");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String number = iterator.next();
            System.out.println(number);


        }


        /*List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        lst.add("e");
        lst.add("f");
        lst.add("g");
        lst.add("h");

        Iterator<String> iterator = lst.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //lst.add(4,"ee");

        //System.out.println(iterator.next());
        //System.out.println(iterator.next());

        iterator.forEachRemaining(new Printer() );



        /*while (iterator.hasNext()){
            System.out.println(iterator.next());
        } */

    }

    /* private static class Printer implements Consumer<String> {
        @Override
        public void accept(String s){
            System.out.println(s);
        }
    } */
}