package com.moi.mockup.dto.response;

import com.moi.mockup.dto.RevokeApplicationDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetRealEstatePrivilegesRevokeApplicationsResponse {
    private List<RevokeApplicationDetail> revokeApplications;  // List of revoke applications
    private String notesArb;     // Notes/Remarks in Arabic
    private String notesEng;     // Notes/Remarks in English

    // Getters and Setters
}