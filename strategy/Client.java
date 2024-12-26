package strategy;

public class Client {
    public static void main(String[] args) {
        double basePrice = 100.0;  // Base price of an item

        // Customer chooses Credit Card payment
        PaymentContext context = new PaymentContext();
        context.setPricingStrategy(new CreditCardPricingStrategy());
        double finalPrice = context.calculatePrice(basePrice);
        System.out.println("Final price with Credit Card: " + finalPrice);

        // Customer chooses E-Wallet payment
        context.setPricingStrategy(new EWalletPricingStrategy());
        finalPrice = context.calculatePrice(basePrice);
        System.out.println("Final price with E-Wallet: " + finalPrice);

        // Customer chooses Cash on Delivery payment
        context.setPricingStrategy(new CashOnDeliveryPricingStrategy());
        finalPrice = context.calculatePrice(basePrice);
        System.out.println("Final price with Cash on Delivery: " + finalPrice);
    }
}
