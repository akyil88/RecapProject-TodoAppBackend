package org.example.recapprojecttodoappbackend;

import java.util.List;

public record TodoApiResponse(
        List<Todo> results
) {
}