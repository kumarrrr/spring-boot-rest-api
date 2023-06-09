package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts(int pageNo , int pageSize);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto ,long id);

    void deletePostById(long id);



}

// PostDto is the return data type
// postDto is the input parameter
// here is the interface ,now we have to define a class to implement the
// interface in the impl package
