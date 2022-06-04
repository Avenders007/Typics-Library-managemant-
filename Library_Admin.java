package Typics;

public class Library_Admin {
    private int ID;
    private String FirstName;
    private String LastName;
   
//    public Library_Admin (int iD, String fm, String lm, String gender) {
//     this.Gender = gender;
//     this.lastName = lm;
//     this.fullName = fm;
//     this.ID = iD;
//    }

    public int getID() {
        return ID;
    }
   
    public void setID(int Setid) {
    ID = Setid;
    }
   
    public void setFirstName(String SetFm) {
    FirstName = SetFm;
    }
   
    public String getFirstName() {
    return FirstName;
    }
   
    public void setLastName(String Lm) {
    LastName = Lm;
    }
   
    public String getLastName() {
    return LastName;
    }
   
}
