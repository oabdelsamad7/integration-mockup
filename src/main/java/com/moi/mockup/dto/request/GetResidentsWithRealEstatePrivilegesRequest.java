package com.moi.mockup.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetResidentsWithRealEstatePrivilegesRequest {
    private String cpyType;           // Company Type – Ministry of Justice (MOJ)
    private String cpyNo;             // Company Number - Ministry of Justice (MOJ)
    private String cpyBr;             // Company Branch - Ministry of Justice (MOJ)
    private String inquirymode;       // Inquiry Mode
    private String residentQID;       // Resident QID (optional)
    private String locationId;        // Location Id (e.g., VP)
    private String userId;            // User Id

    // Getters and Setters
}
