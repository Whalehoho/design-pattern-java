package strategy;

// Concrete strategy
public class EWalletPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        // Applying a 5% cashback for e-wallet payments
        return basePrice - (basePrice * 0.05);
    }
}
