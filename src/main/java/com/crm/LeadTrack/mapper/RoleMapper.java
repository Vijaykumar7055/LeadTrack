package com.crm.LeadTrack.mapper;


import com.crm.LeadTrack.Entity.Role;
import com.crm.LeadTrack.dto.request.RoleRequestDto;
import com.crm.LeadTrack.dto.responses.RoleResponseDto;

public class RoleMapper {

    Role role = new Role();
    public Role role(RoleRequestDto dto){
        role.setRoleName(dto.getRoleName());
        role.setDescription(dto.getDescription());
        return role;
    }
    public RoleResponseDto toResponseDto(Role role){
        RoleResponseDto dto = new RoleResponseDto();


        dto.setId(role.getId());
        dto.setRoleName(role.getRoleName());
        dto.setDescription(role.getDescription());
        dto.setCreatedAt(role.getCreatedAt());
        dto.setUpdatedAt(role.getUpdatedAt());

        return dto;



    }
}
