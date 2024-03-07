package main.java.lesson5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrderOfEl {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<String>();
         elements.add("Cat");
        elements.add("Dog");
        elements.add("Cow");
        elements.add("Butterfly");
        Collections.reverse(elements);
        System.out.println(elements);

    }
}
