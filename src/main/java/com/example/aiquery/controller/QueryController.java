package com.example.aiquery.controller;

import com.example.aiquery.model.QueryRequest;
import com.example.aiquery.model.QueryResponse;
import com.example.aiquery.service.QueryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/query")
public class QueryController {

    private final QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    @PostMapping
    public QueryResponse handleQuery(@RequestBody QueryRequest request) {
        String answer = queryService.process(request);
        return new QueryResponse(answer);
    }
}
