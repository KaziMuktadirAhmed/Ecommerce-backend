package com.mrbin.mr_bin.models;

import com.mrbin.mr_bin.models.utils.Address;
import com.mrbin.mr_bin.models.utils.Avatar;
import com.mrbin.mr_bin.models.utils.Notification;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "isVerified")
    private Boolean isVerified = false;

    @Field(name = "address")
    private Address address;

    @Indexed(unique = true)
    @Field(name = "email")
    private String email;

    @Field(name = "password")
    private String password;

    @Field(name = "role")
    private String role = "user";

    @Indexed(unique = true)
    @Field(name = "phone")
    private String phone;

    @Field(name = "favorites")
    private List<String> favorites;

    @Field(name = "notifications")
    private List<Notification> notifications;

    @Field(name = "avatar")
    private Avatar avatar;

    @Field(name = "createdAt")
    private Date createdAt = new Date();

    @Field(name = "resetPasswordToken")
    private String resetPasswordToken;

    @Field(name = "resetPasswordExpire")
    private Date resetPasswordExpire;

    // Constructors, getters, and setters

    // Additional methods for JWT token and password comparison can be added here
}

