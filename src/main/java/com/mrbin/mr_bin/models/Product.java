package com.mrbin.mr_bin.models;

import com.mrbin.mr_bin.models.utils.Address;
import com.mrbin.mr_bin.models.utils.Avatar;
import com.mrbin.mr_bin.models.utils.Bid;
import com.mrbin.mr_bin.models.utils.Comment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "products")
public class Product {
    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "category")
    private String category;

    @Field(name = "address")
    private Address address;

    @Field(name = "isVerified")
    private Boolean isVerified = false;

    @Field(name = "quantity")
    private Integer quantity;

    @Field(name = "condition")
    private String condition = "used";

    @Field(name = "images")
    private List<Avatar> images;

    @Field(name = "user")
    private String userId; // Assuming this is the user ID as a string

    @Field(name = "buyer")
    private String buyerId; // Assuming this is the buyer ID as a string

    @Field(name = "product_type")
    private String productType = "marketplace";

    @Field(name = "description")
    private String description;

    @Field(name = "date_of_purchase")
    private String dateOfPurchase;

    @Field(name = "purchase_price")
    private Double purchasePrice;

    @Field(name = "bids")
    private List<Bid> bids;

    @Field(name = "comments")
    private List<Comment> comments;

    @Field(name = "created_at")
    private Date createdAt = new Date();

    // Constructors, getters, setters, and other methods...

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", address=" + address +
                ", isVerified=" + isVerified +
                ", quantity=" + quantity +
                ", condition='" + condition + '\'' +
                ", images=" + images +
                ", userId='" + userId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", productType='" + productType + '\'' +
                ", description='" + description + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", bids=" + bids +
                ", comments=" + comments +
                ", createdAt=" + createdAt +
                '}';
    }
}
