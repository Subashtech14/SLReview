package switchcaseDemo;

public class Switchcase {
    public static void main(String[] args) {
        String week="Monday";
        switch (week){
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            case "Friday" -> System.out.println("Friday");
            case "Saturday" -> System.out.println("Saturday");
            default -> System.out.println("Wrong Input");

        };

    }
}
