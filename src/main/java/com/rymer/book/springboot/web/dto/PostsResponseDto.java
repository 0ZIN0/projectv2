package com.rymer.book.springboot.web.dto;

import com.rymer.book.springboot.domain.posts.Posts;
import lombok.Getter;


@Getter
public class PostsResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.content = entity.getContent();

    }
}