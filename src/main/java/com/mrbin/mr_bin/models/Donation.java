package com.mrbin.mr_bin.models;

import com.mrbin.mr_bin.models.utils.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "donations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donation {
    @Id
    private String id;

    @Field(name = "user")
    private String userId;

    @Field(name = "product")
    private String productId;

    @Field(name = "organization")
    private String organizationId; // Assuming this is the organization ID as a string

    @Field(name = "pickupDate")
    private Date pickupDate;

    @Field(name = "address")
    private Address address;

    @Field(name = "orderType")
    private String orderType;

    @Field(name = "status")
    private String status = "Initiated";

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setAddress(String location, Double lat, Double lng) {
        this.address = new Address(location,lat,lng);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", productId=" + productId +
                ", organizationId=" + organizationId +
                ", pickupDate=" + pickupDate +
                ", address=" + address +
                ", orderType='" + orderType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
