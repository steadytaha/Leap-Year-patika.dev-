import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        
        double check1 = year % 4;
        double check2 = year % 100;
        double check3 = year % 400;
        
        if(check2 == 0.0){
            if(check3 == 0.0){
                System.out.println(year + " is a leap year!");
            }else{
                System.out.println(year + " is not a leap year!");
            }
        }else if(check1 == 0.0){
            System.out.println(year + " is a leap year!");
        }else{
            System.out.println(year + " is not a leap year!");
        }
    }
}
