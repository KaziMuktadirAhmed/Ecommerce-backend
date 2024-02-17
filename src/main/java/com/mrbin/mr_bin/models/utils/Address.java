package com.mrbin.mr_bin.models.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String location;
    private Double lat;
    private Double lng;

}
