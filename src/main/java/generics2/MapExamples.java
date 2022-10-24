package generics2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        // Generic Type with two type parameters
        Map<String, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyOlson.getName(), peggyOlson);
        madMen.put(bertCooper.getName(), bertCooper);

        // Point out hashcode/equals is used here as well
        System.out.println(madMen);

        // foreach key
        for (String name : madMen.keySet())
        {
            System.out.println(name);
        }

        // foreach value
        for (Person person : madMen.values())
        {
            System.out.println(person);
        }

        // foreach entry - again two generic parameters
        for (Map.Entry<String, Person> entry : madMen.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}