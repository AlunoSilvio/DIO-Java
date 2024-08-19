package com.user;


public class User {

    private Integer id;
    private String  login;
    private String  password;

    public User () {

    }

    public User ( String user, String password ) {

        this.login = user;
        this.password  = password;
    }

    @Override
    public String toString () {

        return "User{" +
                "login='" + this.login + '\'' +
                ", password'" + this.password + '\'' +
                '}';
    }

    public String getLogin () {
        
        return login;
    }

    public void setLogin ( String user ) {
       
        this.login = user;
    }

    public String getPassword () {
       
        return password;
    }

    public void setPassword ( String password ) {
        
        this.password = password;
    }

    public Integer getId () {

        return this.id;
    }

    public void setId ( Integer id ) {

        this.id = id;
    }
    
}
