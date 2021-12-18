
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Airplane Ticket Sell: ");
        System.out.println("----------------------------------------------------");

        System.out.println("Welcome to Pegasus. Here Are Ticket Dicounts for Our Customers : ");
        String discounts = "1. Age Discounts: \n"
                + "Customers who is younger than 12, gets %50 discount\n"
                + "Customers who is younger than 25 and older than 13, gets %50 discount\n"
                +"Customers who is between 25 and 65, doesn't gett the age discount\n"
                +"Customers who is older than 65, gets %50 discount\n"
                +"2. two-way round trip ticket discount : \n"
                + "Customers who buys two way round trip ticket gets %20 discount";
        System.out.println(discounts);
        System.out.println("----------------------------------------------------");
        System.out.print("Please enter your distance : ");
        double distance = scanner.nextDouble();
        if (distance <= 0) {
            System.out.println("Error. Unavalible Valid for Distance");
            return;
        }
        double normalprice = distance*0.1;
        double secondaryprice;
        int age;
        int type;
        double lastPrice;
        System.out.print("Please enter your age : ");
        age = scanner.nextInt();
        System.out.println("Please chose the type for your trip :");
        System.out.println("1. One way trip");
        System.out.println("2. Two way trip");
        type = scanner.nextInt();
        if (age>=0 && age<12){
            secondaryprice = normalprice*0.5;
            if (type == 1) {
                lastPrice = secondaryprice;
                System.out.println(lastPrice);
            }
            else if (type == 2) {
                lastPrice = (secondaryprice*0.8)*2;
                System.out.println(lastPrice);
            }
            else{
                System.out.println("Error. Unavalible Valid for type of trip");
                return;
            }
        }
        else if (age >= 12 && age<24) {
            secondaryprice = normalprice*0.9;
            if (type == 1) {
                lastPrice = secondaryprice;
                System.out.println(lastPrice);
            }
            else if (type == 2) {
                lastPrice = (secondaryprice*0.8)*2;
                System.out.println(lastPrice);
            }
            else{
                System.out.println("Error. Unavalible Valid for type of trip");
                return;
            }
        }
        else if (age >=24 && age<65){
            secondaryprice = normalprice;
            if (type == 1) {
                lastPrice = secondaryprice;
                System.out.println(lastPrice);
            }
            else if (type == 2) {
                lastPrice = (secondaryprice*0.8)*2;
                System.out.println(lastPrice);
            }
            else{
                System.out.println("Error. Unavalible Valid for type of trip");
                return;
            }
        }
        else if(age>=65){
            secondaryprice = normalprice*0.7;
            if (type == 1) {
                lastPrice = secondaryprice;
                System.out.println(lastPrice);
            }
            else if (type == 2) {
                lastPrice = (secondaryprice*0.8)*2;
                System.out.println(lastPrice);
            }
            else{
                System.out.println("Error. Unavalible Valid for type of trip");
                return;
            }
        }
        else{
            System.out.println("Error. Unavalible Valid for Age");
            return;
        }
        }
}
