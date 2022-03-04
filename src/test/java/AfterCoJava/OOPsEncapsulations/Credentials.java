package AfterCoJava.OOPsEncapsulations;

public class Credentials {

    // two private variables
    private String username;
    private String password;

    //just created default constructor
    public void Credential(){
    }

    // Having Constructor
    public void Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter and setter:
    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }




}


