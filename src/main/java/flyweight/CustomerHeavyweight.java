package flyweight;


public class CustomerHeavyweight {
    private int customerId;
    private String firstName;
    private String lastName;
    private Address residenceAddress;
    private HealthProfile profile;
    //city map with a red dot representing residence location private Image locationMap;
    private final Image locationMap;

    public CustomerHeavyweight(int customerId, String firstName, String lastName, Address residenceAddress, HealthProfile profile, Image locationMap) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residenceAddress = residenceAddress;
        this.profile = profile;
        this.locationMap = locationMap;
    }
}
