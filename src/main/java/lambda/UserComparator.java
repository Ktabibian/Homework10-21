package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {
    public static void main(String[] args) {

        UserTwo sarah = new UserTwo("Sarah", 28);
        UserTwo james = new UserTwo("James", 35);
        UserTwo mary = new UserTwo("Mary", 33);
        UserTwo john1 = new UserTwo("John", 24);
        UserTwo john2 = new UserTwo("John", 25);

        List<UserTwo> users = Arrays.asList(sarah, james, mary, john1, john2);

        Comparator<UserTwo> cmpName = Comparator.comparing(user -> user.getName());
        Comparator<UserTwo> cmpAge = Comparator.comparing(user -> user.getAge());
        Comparator<UserTwo> comparator = cmpName.thenComparing(cmpAge);
        Comparator<UserTwo> reversed = comparator.reversed();

        users.sort(reversed);
        users.forEach(u -> System.out.println(u));
    }
}
