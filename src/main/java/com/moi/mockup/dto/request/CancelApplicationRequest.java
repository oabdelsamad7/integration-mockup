package com.moi.mockup.dto.request;

import lombok.Data;

@Data
public class CancelApplicationRequest {
    private String cpyType;
    private String cpyNo;
    private String cpyBr;
    private String applicantType;
    private String applicationNumber;
    private String residentQID;
    private String notesArb;
    private String notesEng;
    private String locationId;
    private String userId;
}
