package strategy;

// Context
public class PaymentContext {
    private PricingStrategy pricingStrategy;

    // Set the pricing strategy dynamically at runtime
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    // Calculate price using the selected pricing strategy
    public double calculatePrice(double basePrice) {
        return pricingStrategy.calculatePrice(basePrice);
    }
}

