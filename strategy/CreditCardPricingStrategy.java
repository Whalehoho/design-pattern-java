package strategy;

//Concrete strategy
public class CreditCardPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        // Applying a 10% discount for credit card payments
        return basePrice * 0.90;
    }
}

