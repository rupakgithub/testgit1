package org.example.api;

public class Abstractionexample {
    public static void main(String[] args) {
        APiTest aPiTest = new APiTest();
        aPiTest.setEmail("test@gmail.com");
        System.out.println(aPiTest.getEmail());
    }
}

class APiTest{
    private String username = "Jack";

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

    public int getPersonalid() {
        return personalid;
    }

    public void setPersonalid(int personalid) {
        this.personalid = personalid;
    }

    private String email = "test@example.com";
    private int personalid = 435346546;
}
