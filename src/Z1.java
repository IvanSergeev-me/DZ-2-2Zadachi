import java.util.Scanner;
public class Z1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Введите число 'a' , потом число 'b'");
        int a = s.nextInt(); //20
        int b = s.nextInt(); //10
        System.out.println("Число 'a'=" + a + " Число 'b'=" + b); // 20 10
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println("Число 'a'=" + a + " Число 'b'=" + b);




    }
}
