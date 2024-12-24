package adapter;

public class CustAdapteeAddress implements AdapteeAddress {
    private int no;
    private String road;
    private String area;
    private String city;
    private String state;
    private int postcode;
    private String country;

    @Override
    public void setNo(int n) {
        no = n;
    }

    @Override
    public void setRoad(String r) {
        road = r;
    }

    @Override
    public void setArea(String a) {
        area = a;
    }

    @Override
    public void setCity(String c) {
        city = c;
    }

    @Override
    public void setState(String s) {
        state = s;
    }

    @Override
    public void setPostcode(int p) {
        postcode = p;
    }

    @Override
    public void setCountry(String c) {
        country = c;
    }

    @Override
    public int getNo() {
        return no;
    }

    @Override
    public String getRoad() {
        return road;
    }

    @Override
    public String getArea() {
        return area;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public int getPostcode() {
        return postcode;
    }

    @Override
    public String getCountry() {
        return country;
    }
    
}
