package com.springboot.blog.payload;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;

}

// This is the PostDto for the Post Entity,it
//since lombok then all getter setters,constructors are pre-defined