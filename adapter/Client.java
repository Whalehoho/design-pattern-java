package adapter;

public class Client {
    public static void main(String[] args) {
        // Creating a new Detailed_Address instance (Version 3)
        AdapteeAddress detailedAddress = new CustAdapteeAddress();
        
        // Creating an AddressAdapter instance
        AddressAdapter addressAdapter = new AddressAdapter(detailedAddress);

        // Set address using old format
        addressAdapter.setAddress("123, Main St, Downtown, City, State, 12345, Country");

        // Get address using old format
        System.out.println(addressAdapter.getAddress());

        // Get address details using new format
        System.out.println("No: " + detailedAddress.getNo());
        System.out.println("Road: " + detailedAddress.getRoad());
        System.out.println("Area: " + detailedAddress.getArea());
        System.out.println("City: " + detailedAddress.getCity());
        System.out.println("State: " + detailedAddress.getState());
        System.out.println("Postcode: " + detailedAddress.getPostcode());
        System.out.println("Country: " + detailedAddress.getCountry());

    }

}
