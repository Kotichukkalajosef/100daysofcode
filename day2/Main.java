import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[]args){


        //swing

//        String name = JOptionPane.showInputDialog("Enter your name:");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
//         JOptionPane.showMessageDialog(null,"your age is "+age);
//         Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height:"));
//         JOptionPane.showMessageDialog(null,"Your height is "+height+" woow");


        //math
//         double x = 3.14;
//         double y = 16.41;
//        double z = -16.66;
//
//
//
//        double zz = Math.min(x,y);
//        double zx = Math.max(x,y);
//        double zxx = Math.abs(z);
//        double zo = Math.sqrt(y);
//        double zoo = Math.round(y);
//        double ceil = Math.ceil(y);
//        double floor = Math.floor(y);
//
//
//
//
//        System.out.println(zx);
//        System.out.println(zz);
//        System.out.println(zxx);
//        System.out.println(zo);
//        System.out.println(zoo);
//        System.out.println(ceil);
//        System.out.println(floor);

        Random rc = new Random();
        int x = rc.nextInt(6)+1;  //here +1 is addeed to get ran num between 1 to 6

        double y = rc.nextDouble(6)+10; //here +10 added then the output will print after from 10 to +6 i.e upto16
        boolean z = rc.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
