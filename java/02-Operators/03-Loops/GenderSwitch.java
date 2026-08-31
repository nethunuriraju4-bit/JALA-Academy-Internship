 public class GenderSwitch {

    public static void main(String[] args) {

        char gender = 'M';

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;

            case 'F':
            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
