package com.aagezaidockerg12.aagezaidockera12.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    private Integer userId;
    private String userName;
    private String userSsn;
    private String userAddress;

    // Default constructor
    public UserEntity() {
    }

    // Parameterized constructor
    public UserEntity(Integer userId, String userName, String userSsn, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userSsn = userSsn;
        this.userAddress = userAddress;
    }

    // Getters and Setters

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSsn() {
        return userSsn;
    }

    public void setUserSsn(String userSsn) {
        this.userSsn = userSsn;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    // toString method
    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSsn='" + userSsn + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
