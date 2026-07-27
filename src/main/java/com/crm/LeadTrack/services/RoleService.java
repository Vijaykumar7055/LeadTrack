package com.crm.LeadTrack.services;

import com.crm.LeadTrack.Entity.Role;
import com.crm.LeadTrack.dao.RoleRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {
    public final RoleRepo roleRepo;

    public Role saveData(Role role){
        return roleRepo.save(role);
    }
}
