
package entity;

public class User {
    private String userName;
    private String passWord;
    private String fullName;
    private String mail;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User() {
    }

    public User(String userName, String passWord, String fullName, String mail) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.mail = mail;
    }
    
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;

    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
   

    
    
    
    
}
