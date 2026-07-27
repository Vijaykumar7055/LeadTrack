package com.crm.LeadTrack.dto.request;

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
      private String roleName;

  @Size(max = 255)
    private String description;


}

