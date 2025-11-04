package com.raymar.RepLog.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSessionDTO {
    private Long id;

    @NotNull
    private LocalDate date;

    private String notes;

    @Valid
    private List<WorkoutSetDTO> sets;
}
