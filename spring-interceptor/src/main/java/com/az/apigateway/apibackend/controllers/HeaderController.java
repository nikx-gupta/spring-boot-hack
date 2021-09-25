package com.az.apigateway.apibackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/headers")
public class HeaderController {
    @GetMapping("/")
    public Map<String, String> Get(@RequestHeader Map<String, String> headers) {
        return headers;
    }

    @GetMapping("/servlet")
    public Map<String, String> headers(HttpServletRequest request) {
        Map<String, String> headers = Collections.list(request.getHeaderNames())
                .stream().collect(Collectors.toMap(x -> x, y -> request.getHeader(y)));
        return headers;
    }
}
