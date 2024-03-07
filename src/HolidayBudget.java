import java.util.*;
public class HolidayBudget {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter budget per day for mountain: ");
        int budgetPerDayForMountain = Integer.parseInt(s.nextLine());

        if  (budgetPerDayForMountain < 30) {
            System.out.println("Bulgaria");
        }
        else {
            System.out.println("Outside Bulgaria");
        }
        System.out.print("Enter budget per day for beach: ");


        System.out.print("Enter budget per day for beach: ");
        int budgetPerDayForBeach = Integer.parseInt(s.nextLine());


        if  (budgetPerDayForBeach < 50) {
            System.out.println("Bulgaria");
        }
        else {
            System.out.println("Outside Bulgaria");
        }


    }

}