package com.example.aiquery.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class QueryRequest {

    @NotBlank(message = "Query prompt must not be empty")
    @Size(max = 1000, message = "Query prompt must be less than 1000 characters")
    private String prompt;

    public QueryRequest() {}

    public QueryRequest(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
