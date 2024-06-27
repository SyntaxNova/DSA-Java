import java.util.Scanner;

public class dayofweek {

    public static void display(String day) {
        System.out.println(day);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display("Enter day number below ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                display("Monday");
                break;
            case 2:
                display("Tuesday");
                break;
            case 3:
                display("wednesday");
                break;
            case 4:
                display("thursday");
                break;
            case 5:
                display("friday");
                break;
            case 6:
                display("staurday");
                break;
            case 7:
                display("sunday");
                break;
        }
    }
}
