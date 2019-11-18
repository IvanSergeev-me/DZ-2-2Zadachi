import java.util.Scanner;
public class Z2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Последовательно введите коэфициенты 'a', 'b' ,'c' квадратного уравнения ax^2+bx+c=0");
        double a= s.nextDouble();
        double b= s.nextDouble();
        double c= s.nextDouble();
        double x1, x2, D;
        D= Math.pow(b, 2)- (4*a*c);
        if (D>0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1=" + x1 + "; x2=" + x2);
        }
        if (D<0){
            System.out.println("no roots");
        }
        if (D==0){
            x1=(-b)/(2*a);
            System.out.println("x=" + x1);
        }
        s.close();
    }
}
