public class Main {
    public static void main(String[] args) {
        double itemPrice = 42;
        double SALES_TAX = 0.05;
        double tax = 0;
        double totalPrice = 0;

        tax = itemPrice * SALES_TAX;
        totalPrice = itemPrice + tax;

        System.out.println("\nThe item cost " + itemPrice + ", at 5% sales tax, " +
                "the tax is " + tax + ", bringing the total to " + totalPrice);
    }
}