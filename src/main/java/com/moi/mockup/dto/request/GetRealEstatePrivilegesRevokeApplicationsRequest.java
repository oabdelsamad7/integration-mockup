package com.moi.mockup.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetRealEstatePrivilegesRevokeApplicationsRequest {
    private String cpyType;                // Company Type – MOJ
    private String cpyNo;                  // Company Number – MOJ
    private String cpyBr;                  // Company Branch – MOJ
    private String inquiryType;            // Inquiry Type: 0, 1, or 2
    private String cancelRPPurposeAplRefNumber;  // Reference number (conditional)
    private String residentQID;            // Resident QID (conditional)
    private String locationId;             // Calling location Id: VP
    private String userId;                 // User id

    // Getters and Setters
}
