
//class that holds user's contact info
public class ContactInfo {
		
		//contact info attributes
		private String phoneNumber;
		private String address;
		private String email;
		
		//contact info constructor
		public ContactInfo(String phoneNumber, String address, String email) {
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.email = email;
		}
		
		//getters and setters
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public String getEmail() {
			return email;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}
