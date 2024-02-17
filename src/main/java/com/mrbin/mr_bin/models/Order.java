package com.mrbin.mr_bin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;

    @Field(name = "user")
    private String userId; // Assuming this is the user ID as a string

    @Field(name = "product")
    private String productId; // Assuming this is the product ID as a string

    @Field(name = "recycler")
    private String recyclerId; // Assuming this is the recycler ID as a string

    @Field(name = "pickupDate")
    private String pickupDate;

    @Field(name = "address")
    private String address;

    @Field(name = "orderType")
    private String orderType;

    @Field(name = "status")
    private String status = "Initiated";

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                ", recyclerId='" + recyclerId + '\'' +
                ", pickupDate='" + pickupDate + '\'' +
                ", address='" + address + '\'' +
                ", orderType='" + orderType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
