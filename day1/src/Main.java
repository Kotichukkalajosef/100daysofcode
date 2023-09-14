import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        varibles

//        int x; //declaration
//         x = 10; //assign
//        int z = 100; // initilazation
//        System.out.println("my name num is "+x);
//        System.out.println(z);
//        String name = "Josef";
//        System.out.println("Hello "+name);

        //swap two variables

//        String x = "Josef";
//        String y = "Kotichukkala";
//        String temp;
//        temp = x;
//        x = y;
//        y = temp;
//
//        System.out.println(x);
//        System.out.println(y);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("food: ");
        String food = sc.nextLine();
        System.out.println(food);
        System.out.println("age is "+age);
        System.out.println("Hello "+name);




    }
}