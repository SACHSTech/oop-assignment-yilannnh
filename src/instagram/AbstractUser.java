package instagram;

import java.util.Date;

/**
 * Presents an abstract user in Instagram. 
 */
abstract class AbstractUser{
    private String username;
    private String email;
    private String password;
    private Date signUpDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSignUpDate() {
        return this.signUpDate;
    }

    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public void signIn(String username, String password) {
        // DO NOTHING for now
    }

    public void signOut() {

    }
}