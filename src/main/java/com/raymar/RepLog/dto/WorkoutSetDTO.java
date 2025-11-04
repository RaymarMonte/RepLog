package com.raymar.RepLog.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutSetDTO {
    private Long id;

    @NotBlank
    private String exerciseName;

    @Min(1)
    private int sets;

    @Min(1)
    private int reps;

    private BigDecimal weight;
    private String notes;
}
