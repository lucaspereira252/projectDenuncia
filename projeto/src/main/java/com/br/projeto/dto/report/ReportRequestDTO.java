package com.br.projeto.dto.report;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportRequestDTO implements Serializable {

    private String description;
    private LocalDate dateOfOccurrence;
    private String office;
}
