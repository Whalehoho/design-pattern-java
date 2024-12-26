package strategy;

// Concrete strategy
public class CashOnDeliveryPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        // Adding a service fee of 3% for cash on delivery
        return basePrice + (basePrice * 0.03);
    }
}

