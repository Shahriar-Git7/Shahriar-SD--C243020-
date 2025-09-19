import java.util.*;

public class Home {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = Math.max(x, Math.max(y, z));

        System.out.println("largest number is: " + max);

        int m=sc.nextInt();
        char op=sc.next().charAt(0);
        int n=sc.nextInt();

        switch(op){
            case '+':
                System.out.println("sum : " + (m+n));
                break;
            case '-':
                System.out.println("abs : " + (m-n));
                break;
            case '*':
                System.out.println("multiple : " + (m*n));
                break;
            case '/':
                System.out.println("divide : " + (m/n));
                break;
        }

        System.out.print("Enter N: ");
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            System.out.print(i + " ");
            System.out.println();
        }

        System.out.println("table for number : ");
        int j = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(j + "*" + i + " = " + (j*i));
        }
        System.out.print("factorial and sum of num : ");
        int f = sc.nextInt();
        int fact=1, sum=0;
        for (int i = 1; i <= f; i++) {
            fact=fact*i;
            sum=sum+i;
        }
        System.out.println("factorial : "+fact);
        System.out.println("sum : "+sum);
        sc.close();
    }
}
