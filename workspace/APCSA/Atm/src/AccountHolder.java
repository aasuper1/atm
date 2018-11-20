
public class AccountHolder {
	private long SSN;
	private String name;
	private long phoneNumber;
	private String address;
	
	public AccountHolder(){
		
	}
	
	public void setSSN(long _SNN){
		SSN = _SNN;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setPhoneNumber(long _phoneNumber){
		phoneNumber = _phoneNumber;
	}
	
	public void setAddress(String _address){
		address = _address;
	}
	
	public long getSSN(){
		return SSN;
	}
	
	public String getName(){
		return name;
	}
	
	public long getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getAddress(){
		return address;
	}
}
