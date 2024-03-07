import java.util.*;
public class Age {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(s.nextLine());

        if  (age >= 16) {
            System.out.println("You are eligible to work..");
        }
        else {
            System.out.println("You are not eligible to work");
        }
    }

}
