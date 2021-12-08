public class Teacher {

    //instance variables
    private String firstname = "";
    private String lastname = "";
    private String subject = "";
    private String email = "";

    //constructors for the Teacher class

    public Teacher(){
        firstname = "";
        lastname = "";
        subject = "";
        email = "";
    }

    public Teacher(String firstname, String lastname, String subject, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
        this.email = email;
    }


    //get methods
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getSubject(){
        return subject;
    }
    public String getEmail(){
        return email;
    }


    //set methods
    public void setFirstname(String newFirstname){firstname = newFirstname;}
    public void setLastname(String newLastname){lastname = newLastname;}
    public void setSubject(String newSubject){subject = newSubject;}
    public void setEmail(String newEmail){email = newEmail;}

    //toString overwritten
    public String toString(){
        return("Name: " + firstname + ", " + lastname + " -|- Subject: " + subject + " -|- Email: " + email);
    }



}
