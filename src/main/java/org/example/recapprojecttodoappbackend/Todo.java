package org.example.recapprojecttodoappbackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document("todo")
public record Todo(String id, String name, String status, String description, TodoOrigin origin
) {
}

