package adapter;

public class AddressAdapter implements TargetAddress {
    private AdapteeAddress adapteeAddress;

    public AddressAdapter(AdapteeAddress adapteeAddress) {
        this.adapteeAddress = adapteeAddress;
    }

    @Override
    public void setAddress(String a) {
        String[] parts = a.split(", ");
        // This method sets a combined string representation of the adaptee address
        adapteeAddress.setNo(Integer.parseInt(parts[0]));
        adapteeAddress.setRoad(parts[1]);
        adapteeAddress.setArea(parts[2]);
        adapteeAddress.setCity(parts[3]);
        adapteeAddress.setState(parts[4]);
        adapteeAddress.setPostcode(Integer.parseInt(parts[5]));
        adapteeAddress.setCountry(parts[6]);
    }

    @Override
    public String getAddress() {
        return adapteeAddress.getNo() + ", " + adapteeAddress.getRoad() + ", " + adapteeAddress.getArea() + ", " + adapteeAddress.getCity() + ", " + adapteeAddress.getState() + ", " + adapteeAddress.getPostcode() + ", " + adapteeAddress.getCountry();
    }
}
