package com.crm.LeadTrack.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String employeeCode;
    private String designation;
    private LocalDate joiningDate;

    @ManyToOne
    @JoinColumn(name = "department_id" , nullable = false)
    private Department department;
}
