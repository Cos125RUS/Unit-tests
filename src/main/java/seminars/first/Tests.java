package seminars.first;

public class Tests {
    public static void assertConditionA () {
        String[] weekends = { "Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
