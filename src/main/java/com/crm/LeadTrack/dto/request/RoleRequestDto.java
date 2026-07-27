package com.crm.LeadTrack.dto.request;

import com.crm.LeadTrack.Entity.RoleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequestDto  {
  @NotBlank
  @Size(max=50)
  private RoleType roleName;

  @Size(max = 255)
    private String description;


}

