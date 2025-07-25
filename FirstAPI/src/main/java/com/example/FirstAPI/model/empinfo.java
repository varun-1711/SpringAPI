package com.example.FirstAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class empinfo {

    @Id
    private int empid;
    private String name;
    private String roll;
    private int salary;

}
