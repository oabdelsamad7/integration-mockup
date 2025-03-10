package com.moi.mockup.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRealEstatePrivilegesRevokeApplicationResponse {

    private String processStatusCode; // '1' for success, '0' for failure
    private String processStatusDescArb;
    private String processStatusDescEng;
    private String residentQID;
    private String cancelRPPurposeAplRefNumber;
    private String noteEng;
    private String noteArb;
    private String systemId;
    private String userId;
}
