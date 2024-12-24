package adapter;

public class AddressAdapter implements TargetAddress {
    private AdapteeAddress adapteeAddress;

    public AddressAdapter(AdapteeAddress adapteeAddress) {
        this.adapteeAddress = adapteeAddress;
    }

    @Override
    public void setAddress(String a) {
        // This method sets a combined string representation of the adaptee address
        String formattedAddress = adapteeAddress.getNo() + " " + adapteeAddress.getRoad() + ", " +
                                  adapteeAddress.getArea() + ", " + adapteeAddress.getCity() + ", " +
                                  adapteeAddress.getState() + " " + adapteeAddress.getPostcode() + ", " +
                                  adapteeAddress.getCountry();
        this.adapteeAddress.setRoad(formattedAddress);
    }

    @Override
    public String getAddress() {
        return adapteeAddress.getRoad();
    }
}
