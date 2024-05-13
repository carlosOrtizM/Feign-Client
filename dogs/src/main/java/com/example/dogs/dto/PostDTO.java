package com.example.dogs.dto;


import lombok.Data;

@Data
public class PostDTO {
    private String title;
    private int id;
    private String body;
    private int userId;
}
