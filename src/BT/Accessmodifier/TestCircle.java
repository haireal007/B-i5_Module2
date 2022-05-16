package BT.Accessmodifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập bán kính của hình tròn:");
        int r = scanner.nextInt();
        Circle circle1=new Circle(r);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.Area());

    }
}
