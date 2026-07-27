package com.crm.LeadTrack.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user" , nullable = false,unique = true)
    private long userId;

    @Column(name = "full_Name", nullable = false , length = 50)
    private String fullName;

    @Column(name = "email", unique = true , nullable = false)
    private String userEmail;

    @Column(name = "password", nullable = false, length = 30)
    private String userPassword;

    @Column(name = "phoneNo" , length = 20, nullable = false , unique = true)
    private String phoneNo;

    @OneToOne
    private Role role;



}
