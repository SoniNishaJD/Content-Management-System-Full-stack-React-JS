package com.nisha.fullstackapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String language;

    @ManyToOne
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Post(Long id) {
        this.id = id;
    }

    public Post(String title, String content, String language, Category category) {
        this.title = title;
        this.content = content;
        this.language = language;
        this.category = category;
    }

    public Post() {
    }

    public Post(Long id, String title, String content, String language, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.language = language;
        this.category = category;
    }
}
