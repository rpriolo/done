package br.com.rpriolo.done.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public record TaskCreationData(String description,
                               LocalDate dueDate,
                               LocalTime dueTime,
                               String tag) {
}
