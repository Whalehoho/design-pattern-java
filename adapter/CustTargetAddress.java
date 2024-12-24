package adapter;

public class CustTargetAddress implements TargetAddress {
    private String address;

    @Override
    public void setAddress(String a) {
        address = a;
    }

    @Override
    public String getAddress() {
        return address;
    }
    
}
