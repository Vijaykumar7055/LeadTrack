package com.crm.LeadTrack.dto.responses;

import com.crm.LeadTrack.Entity.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponseDto {
    private Long id;
    private RoleType roleName;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
