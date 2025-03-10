package com.moi.mockup.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReceiveRealestateApplicationResponse {
    private String processStatusCode;
    private String processStatusDescArb;
    private String processStatusDescEng;
    private String applicationNumber;
    private String applicantType;
    private String applicationStatusDesEn;
    private String applicationStatusDesAr;
    private String visaNumber;
    private String visaStatusDesEn;
    private String visaStatusDesAr;
    private String visaIssueDate;
    private String visaExpiryDate;
    private String aplRecieveDate;
    private String aplExpiryDate;
    private String residentQID;
    private String notesAr;
    private String notesEn;

    // Getters and setters
}
