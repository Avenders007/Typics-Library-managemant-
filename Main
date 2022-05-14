package Typics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Scanner;
public class Main {//No recursion //No User authentication //No Management of users //Users should be able to borrow books //No Book databases //Incomplete UML Diagram

	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Typics System");
		System.out.println("Please enter as appropriate: Admin, Alumni, Lecturer, Student, Staff, Author");
		String UserResponse = userInput.next(); 
		UserResponse = UserResponse.toUpperCase();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		
		if(UserResponse.equals("LECTURER")) {
			Lecturer Lec = new Lecturer();
			System.out.println("First name: ");
			Lec.setfirstName(userInput.next());
			
			System.out.println("Surname: ");
			Lec.setLastName(userInput.next());
			
			System.out.println("Gender: ");
			Lec.setGender(userInput.next());
			
			System.out.println("Lecturer ID number: ");
			Lec.setLecturerID(userInput.nextInt());
			
			System.out.println("Books borrowed");//Use the books bar-code as this does not accept string combinations 
			Lec.setBooks_Borrowed(userInput.next());
			
			System.out.println("Balance due: ");//Still to be resolved 
			Lec.setBalance(userInput.nextDouble());
			
			File file = new File("Lecturer_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
//			pw.println(Lec.getFirstName() + "\t" + "\t" + Lec.getLastName() + "\t" + "\t" + Lec.getGender() + "\t" + Lec.getLecturerID() + "\t" + Lec.getBooks_Borrowed() + "\t" + Lec.getBalance() + "\t" + dtf.format(now)); 
			pw.println(String.format("%-10s%s", Lec.getFirstName(), Lec.getLastName() + "\t" + String.format("%-10s%s", Lec.getGender(), Lec.getLecturerID() + "\t" + String.format("%-10s%s", Lec.getBooks_Borrowed(), Lec.getBalance() + "\t" + dtf.format(now)))));			
			pw.close();
			
		}
		
		else if(UserResponse.equals("ALUMNI")) {
			Alumni Alu = new Alumni();
			System.out.println("First name: ");
			Alu.setfirstName(userInput.next());
			
			System.out.println("Surname: ");
			Alu.setlastName(userInput.next());
			
			System.out.println("Student number: ");
			Alu.setStudentNumber(userInput.nextInt());
			
			System.out.println("Gender: ");
			Alu.setGender(userInput.next());
			
			System.out.println("Age: ");
			Alu.setAge(userInput.nextInt());
			
			System.out.println("Graduation year: ");
			Alu.setgradYear(userInput.nextInt());
			
			System.out.println("Course code: ");
			Alu.setCourseCode(userInput.next());
			
			System.out.println("Book borrowed: ");
			Alu.setbookBorrowed(userInput.next());
			
			System.out.println("Balance due: ");
			Alu.setBalance(userInput.nextDouble());
			
			File file = new File("Alumni_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
//			pw.println(Alu.getfirstName() + "\t" + "\t" + Alu.getlastName() + "\t" + "\t" + Alu.getstudentNumber() + "\t" + Alu.getGender() + "\t" + Alu.getAge() + "\t" + Alu.getgradYear() + "\t" + Alu.getCourseCode() + "\t" + Alu.getbooksborrwed() + "\t" + Alu.getBalance() + "\t" + dtf.format(now)); 
			
			pw.println(String.format("%-10s%s" , Alu.getfirstName(), Alu.getlastName()) + "\t" + String.format("%-10s%s", Alu.getstudentNumber(), Alu.getGender() + "\t" + String.format("%-10s%s", Alu.getAge(), Alu.getgradYear() + "\t" + String.format("%-10s%s", Alu.getCourseCode(), Alu.getbooksborrwed() + "\t" + String.format("%-10s%s", Alu.getBalance(), dtf.format(now))))));
			
			pw.close();
			
		}
		
		else if(UserResponse.equals("AUTHOR")) {
			Author Aut = new Author();
			System.out.println("First name: ");
			Aut.setFirstName(userInput.next());
			
			System.out.println("Last name: ");
			Aut.setLastName(userInput.next());
			
			System.out.println("Author ID: ");
			Aut.setAuthorID(userInput.nextInt());
			
			System.out.println("Genres: ");
			Aut.setGenres(userInput.next());
			
			File file = new File("Author_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(String.format("%-10s%s" ,Aut.getFirstName(), Aut.getLastName()) + "\t" + String.format("%-10s%s", Aut.getAuthorID(), Aut.getGenres()));
			pw.close();
		}
		else if (UserResponse.equals("STUDENT")) {
			Students Stu = new Students();
			System.out.println("First name: ");
			Stu.setFirstName(userInput.next());
			
			System.out.println("Last name: ");
			Stu.setLastName(userInput.next());
			
			System.out.println("Student number: ");
			Stu.setStudentNumber(userInput.nextInt());
			
			System.out.println("Age: ");
			Stu.setAge(userInput.nextInt());
			
			System.out.println("Gender: ");
			Stu.setGender(userInput.next());
			
			System.out.println("Course code: ");
			Stu.setCourseCode(userInput.next());
			
			System.out.println("Books borrowed: ");
			Stu.setBookBorrowed(userInput.next());
			
			System.out.println("Balance: ");
			Stu.setBalance(userInput.nextDouble());
			
			File file = new File("Student_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(String.format("%-10s%s" ,Stu.getFirstName(), Stu.getLastName()) + "\t" + String.format("%-10s%s" ,Stu.getStudentNumber(), Stu.getAge()) + "\t" + String.format("%-10s%s" ,Stu.getGender(), Stu.getCourseCode() + "\t" + String.format("%-10s%s" ,Stu.getBookBorrowed(), Stu.getBalance() + "\t" + dtf.format(now))));
			pw.close();
			
		}
		
		else if(UserResponse.equals("STAFF")) {
			Library_Staff Sta = new Library_Staff();
			System.out.println("First name: ");
			Sta.setFirstName(userInput.next());
			
			System.out.println("Last name: ");
			Sta.setLastName(userInput.next());
			
			System.out.println("Staff ID: ");
			Sta.setStaffID(userInput.nextInt());
			
			File file = new File("Library_Staff_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(String.format("%-10s%s" ,Sta.getFirstName(), Sta.getLastName()) + "\t" + String.format("%-10s%s" ,Sta.getStaffID(), dtf.format(now)));
			pw.close();
		}
		
		else if(UserResponse.equals("ADMIN")) {
			Library_Admin Adm = new Library_Admin();
			System.out.println("Admin ID: ");
			Adm.setID(userInput.nextInt());
			
			System.out.println("First name: ");
			Adm.setFirstName(userInput.next());
			
			System.out.println("Last name: ");
			Adm.setLastName(userInput.next());
			
			File file = new File("Library_Admin_Content.text");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(String.format("%-10s%s" , Adm.getID(), Adm.getFirstName()) + "\t" + String.format("%-10s%s" , Adm.getLastName(), dtf.format(now)));
			pw.close();
		}
		
		}
		
	}


