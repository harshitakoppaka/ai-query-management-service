package com.example.aiquery.service;

import com.example.aiquery.model.QueryRequest;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

    public String process(QueryRequest request) {
        return "AI response for: " + request.getQuery();
    }
}
