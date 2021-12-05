package com.example.endofgame.dto;

import java.time.LocalDateTime;

public record CategorySummary(Long id, String name,
                              // ToDo: change format of those two fields for nicer one
                              LocalDateTime created,
                              LocalDateTime updated) {
}
