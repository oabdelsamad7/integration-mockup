package com.moi.mockup.dto.request;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ValidateReceiveApplicationEligibilityRequest {
    private String cpyType;
    private String cpyNo;
    private String cpyBr;
    private String applicantType;
    private String passportNumber;
    private String visaNatCode;
    private String residentQID;
    private String residentQidExpDte;
    private String locationId;
    private String userId;

    // Getters and setters
}
