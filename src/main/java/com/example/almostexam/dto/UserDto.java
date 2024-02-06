package com.example.almostexam.dto;

public class UserDto {
    private long id;
    private String nickName;
    private String email;
    private String password;
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String firstName) {
        this.nickName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
