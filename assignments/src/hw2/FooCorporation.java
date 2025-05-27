package hw2;

public class FooCorporation {
    public static void calc_pay(double base_pay, int hours_worked) {
        if(base_pay < 8.00)
            System.out.println("error");
        else if(hours_worked <= 40)
            System.out.println(hours_worked * base_pay);
        else if(hours_worked <= 60)
            System.out.println(40 * base_pay + (hours_worked - 40) * (1.5 * base_pay));
        else System.out.println("error");
    }
    public static void main(String[] args) {
        calc_pay(7.50, 35);
        calc_pay(8.20, 47);
        calc_pay(10.00, 73);
    }
}
