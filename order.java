package UML_ClassConvertToCodes;

import java.util.Scanner;

public class order {

    //attributes
    private int orderId;
    private String dateCreated;
    private String dateShipped;
    private String customersName;
    private String Status;
    private float shippingFee;
    double subtotal;
    double total;

    // methods
    public void viewShippingVouchers() {
        System.out.println("Free Shipping Voucher \n (Up to ₱55) \n Expiring: 1 day left");
        System.out.println("Free Shipping Voucher \n (Up to ₱30) \n Expiring: 1 day left");
        System.out.println("Free Shipping Voucher \n (Up to ₱58) \n Expiring: 16 hours left");
        System.out.println("Discount/Cashback \n 90% off \n Min. Spend ₱0 Capped at ₱70 \n Expiring: 1 day left");
        System.exit(0);
    }

    public void calcSubTotal() {
        Scanner input = new Scanner(System.in);
        //Receive input from keyboard
        System.out.println("Enter a subtotal: ");
        subtotal = input.nextDouble();
        System.out.println("Enter shippingFee: ");
        shippingFee = input.nextFloat();
    }

    public void calcTotal() {
        total = subtotal - shippingFee;
        if (shippingFee <= 0) {
            System.out.printf("total = subtotal");
        } else if (shippingFee > 1) {
            System.out.printf("total = subtotal - shipping fee");
        }
    }

    public void placeOrder() {

    }
}
