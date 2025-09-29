
//class that holds the information for a racer's license.
public class License {
	
	//license attributes
	private String purchaseDate;
	private String expiryDate;
	private String ownerName;
	private CAT currentCAT;
	
	//license constructor
	public License(String purchaseDate, String expiryDate, String ownerName, CAT currentCAT) {
		this.purchaseDate = purchaseDate;
		this.expiryDate = expiryDate;
		this.ownerName = ownerName;
		this.currentCAT = currentCAT;
	}
	
	//getters and setters
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public CAT getCurrentCAT() {
		return currentCAT;
	}
}



