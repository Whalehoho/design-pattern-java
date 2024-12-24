package adapter;

public class Client {
    public static void main(String[] args) {
        // Creating a new Detailed_Address instance (Version 3)
        AdapteeAddress detailedAddress = new CustAdapteeAddress();
        detailedAddress.setNo(123);
        detailedAddress.setRoad("Baker Street");
        detailedAddress.setArea("West End");
        detailedAddress.setCity("London");
        detailedAddress.setState("Greater London");
        detailedAddress.setPostcode(12345);
        detailedAddress.setCountry("UK");

        // Using the AddressAdapter to adapt the Detailed_Address to Address
        TargetAddress address = new AddressAdapter(detailedAddress);
        address.setAddress("");
        
        // Getting the adapted address in a simple format
        System.out.println("Address: " + address.getAddress());

    }

}
