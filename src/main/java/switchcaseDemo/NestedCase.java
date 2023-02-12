package switchcaseDemo;

public class NestedCase {
    public static void main(String[] args) {
        String college_name="BIT";
        int department_id=102;

        switch(college_name)

        {
            case "BIT":
                System.out.println("BIT");
                switch(department_id)
                {
                    case 101:
                        System.out.println("Mechanical Department");
                        break;
                    case 102:
                        System.out.println("Computer Department");
                        break;
                    case 103:
                        System.out.println("Civil Department");
                        break;
                }
                break;
            case "ITS":
                System.out.println("ITS");
                switch(department_id)
                {
                    case 101:
                        System.out.println("Mechanical Department");
                        break;
                    case 102:
                        System.out.println("Computer Department");
                        break;
                    case 103:
                        System.out.println("Civil Department");
                        break;
                }
                break;
            case "ABS":
                System.out.println("ABS");
                switch(department_id)
                {
                    case 101:
                        System.out.println("Mechanical Department");
                        break;
                    case 102:
                        System.out.println("Computer Department");
                        break;
                    case 103:
                        System.out.println("Civil Department");
                        break;
                }
                break;

            default :
                System.out.println("default");
        }
    }
}
