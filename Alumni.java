package Typics;

public class Alumni {
   private String firstName;
   private String lastName;  
   private int studentNumber;
   private String Gender;
   private int Age;
   private int GradYear;
   private String CourseCode;
   private String bookBorrowed;
   private double Balance;

//    public Alumni(String FM, String fm, String lm, int sNL, char gender, int time, String FAC, int graduation, String certificate, String bBd, String bOd, float blnce) {//*Age is represented as time
//        this.firstName = fm;
//        this.lastName = lm;
//        this.studentNumber = sNL;
//        this.sex = gender;
//        this.Age = time;
//        this.Faculty = FAC;
//        this.gradYear = graduation;
//        this.degree = certificate;
//        this.booksBorrowed = bBd;
//        this.booksOverdue = bOd;
//        this.Balance = blnce;
//    }

   public void setfirstName(String fName) {
       firstName = fName;
   }
   
   public String getfirstName() {
    return firstName;
   }
   public void setlastName(String LName) {
       lastName = LName;
   }
   
   public String getlastName() {
    return lastName;
   }
   
   public void setStudentNumber(int StNumber) {
       studentNumber = StNumber;
   }

   public int getstudentNumber() {
       return studentNumber;
   }
   
   public void setGender(String gender) {
    Gender = gender;
   }
 
   public String getGender() {
       return Gender;
   }
   
   public void setAge(int age) {
       Age = age;
   }
 
   public int getAge() {
       return Age;
   }
   
   public void setgradYear(int gradYear) {
    GradYear = gradYear;
   }
 
   public int getgradYear() {
       return GradYear;
   }
 
   public void setCourseCode(String Ccode) {
    CourseCode = Ccode;
   }
   
   public String getCourseCode() {
    return CourseCode;
   }
 
   public void setbookBorrowed(String Bborrowed) {
    bookBorrowed = Bborrowed;
   }
   
   public String getbooksborrwed() {
    return bookBorrowed;
   }
   
   public void setBalance(double balance) {
       Balance = balance;
   }
   
   public double getBalance() {
       return Balance;
   }
 
}
