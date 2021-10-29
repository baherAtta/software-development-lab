public class Address {
    private int streetNo;
    private String city;
    private String country;


    public Address(int streetNo, String city, String country) {
        this.streetNo = streetNo;
        this.city = city;
        this.country = country;
    }


    public int getStreetNo() {
        return this.streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "{" +
            " streetNo='" + getStreetNo() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }

}
