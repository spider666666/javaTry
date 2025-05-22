package org.example.springdemo01.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer ID;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String phone;
    private Integer job;
    private Integer salary;
    private String image;
    private LocalDate entry_date;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    //
    private String deptName;
}
