import genercis5.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonStorageTest {

    private Partner donDraper = new Partner("Don Draper", 89);
    private Partner bertCooper = new Partner("Bert Cooper", 100);
    private Employee peggyOlson = new Employee("Peggy Olson", 65);

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    @Test
    public void savesAndLoadsPerson() throws Exception
    {
        saver.save(donDraper);

        assertEquals(donDraper, loader.load());
    }

    @Test
    public void savesAndLoadsArraysOfPeople() throws Exception{
        List<Partner> person = new ArrayList<>();
        person.add(donDraper);
        person.add(bertCooper);

        saver.saveAll(person);

        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper, loader.load());
    }

    @Test
    public void loadsListOfPeople() throws Exception{
        saver.save(donDraper);
        saver.save(peggyOlson);

        List<Person> people = new ArrayList<>();
        loader.loadAll(people);

        assertEquals(donDraper, people.get(0));
        assertEquals(peggyOlson, people.get(1));
    }

}
