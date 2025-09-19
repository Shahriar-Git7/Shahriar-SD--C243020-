import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a+b)/2.0;

        if(avg > c){
            System.out.println("avg greater than c");
        }else{
            System.out.println("avg less than c");
        }
    }
}
