package org.example.recapprojecttodoappbackend;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


import java.util.List;

import java.awt.*;

@Service
public class TodoService {

    private final RestClient restClient;

    public TodoService() {
        this.restClient = RestClient.builder()
                .baseUrl("http://localhost:8080")
                .build();

}

    public String loadAllCharacters() {

        String body = restClient.get()
                .uri("/")
                .retrieve()
                .body(String.class);

        return body;
    }

}