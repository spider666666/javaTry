package org.example.springdemo01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpExpr {

    private Integer id;
    private Integer emp_id;
    private LocalDate begin;
    private LocalDate end;
    private String company;
    private String job;
}
