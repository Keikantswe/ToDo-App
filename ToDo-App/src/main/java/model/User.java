package model;

public class User {

    private String firstname;
    private String lastname;
    private String username;
    private  String gender;
    private String password;


    public User(){

    }
    public User(String firstname , String lastname , String username, String password, String  gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.gender = gender;
        this.password = password;
    }

    public String getFirstname(){
        return  firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return   lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender(){
        return  gender;
    }

    public void setGender(String gender){this.gender =gender;}
}
