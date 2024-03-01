public class Address {
	// defining fields
	private String Street;
	private String State;
	private String City;
	private int ZipCode;

	// no-argument constructor
	Address() {
		this.Street = "Ahmad Shawky 3"; // has value Ahmad Shawky 3
		this.State = "Free"; // has value Free
		this.City = "Jerusalem"; // has value Jerusalem
		this.ZipCode = 9103401; // has value 9103401
	}

	// constructor with arguments that mentioned in UML
	Address(String Street, String State, String City, int ZipCode) {
		this.Street = Street;
		this.State = State;
		this.City = City;
		this.ZipCode = ZipCode;
	}

	// getters and setters

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}

	@Override
	public String toString() { // it should print in String
		return "Address [Street = " + getStreet() + ", State = " + getState() + ", City = " + getCity()
				+ ", Zip Code = " + getZipCode() + "]";
	}

}
