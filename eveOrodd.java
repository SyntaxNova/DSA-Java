import java.util.Scanner;

public class eveOrodd {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("eneter n = ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
