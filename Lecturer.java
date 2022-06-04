package Typics;

public class Lecturer {
	private String FirstName;
	private String LastName;
	private String Gender;
	private int LecturerID;
	private String Books_Borrowed;//This will be Codabar 
	private double Balance;  
	
//	public Lecturer(String LecName, String LecSurname, String LecGender, int LecID, String BksBrrwd, String BksOvd, Float blnce) {
//		this.FirstName = LecName;
//		this.LastName = LecGender;
//		this.Gender = LecGender;
//		this.LecturerID = LecID;
//		this.Books_Borrowed = BksBrrwd; 
//		this.Books_Overdue = BksOvd;
//		this.Balance = blnce; 
//	}
	
	public void setfirstName(String Fname) {
		FirstName = Fname;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setLastName(String Lname) {
		LastName = Lname;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setGender(String gnder) {
		Gender = gnder;
	}
	
	public String getGender(){
		return Gender;
	}
	
	public void setLecturerID(int lecId) {
		LecturerID = lecId;
	}
	
	public int getLecturerID() {
		return LecturerID;
	}
	
	public String getBooks_Borrowed() {
		return Books_Borrowed;
	}
	
	public void setBooks_Borrowed(String books_borrowed) {
		Books_Borrowed = books_borrowed;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double balance) {
		Balance = balance;
	}
}
