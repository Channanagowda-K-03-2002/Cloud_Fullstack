package java04;

import java.util.ArrayList;

record User ( String name, int age ) {
    public User {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
}
public class J14 {
    public static void main(String[] args) {
        User u = new User("Aaryan", 20);
        System.out.println(u.name());
        System.out.println(u.age());
        
        String day = "Sunday";
        boolean isWeekend = switch (day) {
            case "Monday", "TuesDay", "Wednesday", "Thursday", "Friday" -> false;
            case "Saturday", "Sunday" -> true;
            default -> throw new IllegalArgumentException("Not a Day of the Week");
        };
        // System.out.println(isWeekend);

        // String multiLine = "Hello my name is Aaryan\nAnd i am a corporate trainer";
        String mLine = """
                Channanagowda is a corporate employee in IBM.
                And "he" is currently working as a Java developer in IBM.
                """;
        System.out.println(mLine);

        if(mLine instanceof String str) {
            System.out.println(str.length());
        }

        var name = "Channanagowda";
        name = "Channanagowda";
        System.out.println(name);
        var count = 3.14;
        System.out.println(count);

        var list = new ArrayList<Integer>();
        list.add(34);
        System.out.println(list);
        for (var i : list) {
            System.out.println(i);
        }



    }
    
}