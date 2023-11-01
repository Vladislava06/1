package com.example.app.models;

import java.time.LocalDateTime;

public class Note {
    private LocalDateTime timestamp;
    private String content;

    public Note(String content) {
        this.timestamp = LocalDateTime.now();
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }
}