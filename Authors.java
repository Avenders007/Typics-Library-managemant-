package Typics;

public class Author {
private String FirstName;
private String LastName;
private int AuthorID;
//    private String Books_Contributed;
    private String Genres;


//    public Author (String fm, String lm, int TBC, String BC, String gs) {
//        this.Total_Books_Contributed= TBC;
//        this.Books_Contributed = BC;
//        this.Genres = gs;
//    }

    public void setFirstName(String Fname) {
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

    public void setAuthorID(int aID) {
    AuthorID = aID;

    }

    public int getAuthorID() {
    return AuthorID;
    }

//    public void setBooks_Contributed(String books_Contributed) {
//        Books_Contributed = books_Contributed;
//    }
//   
//    public String getBooks_Contributed() {
//        return Books_Contributed;
//    }

    public void setGenres(String genres) {
        Genres = genres;

    }

    public String getGenres() {
        return Genres;
    }

}
