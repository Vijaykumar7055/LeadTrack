package com.crm.LeadTrack.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "department_name" , nullable = false , length = 50)
    private  String departmentName;
    private String description;

      @Enumerated(EnumType.STRING)
      @Column(name = "status", nullable = false)
      private EmployeeStatus status;

    @CreationTimestamp
    private LocalDateTime createAt;

    @CreationTimestamp
    private LocalDateTime updateAt;



}
