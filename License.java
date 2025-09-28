package SER315_GroupProject;

public class License {
	
	//License attributes
	private String purchaseDate;
	private String expiryDate;
	private String ownerName;
	private CAT currentCAT;
	
	//License constructor
	public License(String purchaseDate, String expiryDate, String ownerName, CAT currentCAT) {
		this.purchaseDate = purchaseDate;
		this.expiryDate = expiryDate;
		this.ownerName = ownerName;
		this.currentCAT = currentCAT;
	}
	
	//Getters and setters
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


