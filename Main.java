import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String lastName=in.next();
        String firstName=in.next();
        String sunject=in.next();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(firstName+" "+ lastName.replace(',',' '));
        System.out.println(sunject);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}