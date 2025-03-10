package com.moi.mockup.dto.request;

import com.moi.mockup.dto.RequiredDocument;
import com.moi.mockup.dto.VisitorApplicantDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ReceiveRealestateApplicationRequest {
    private String cpyType;
    private String cpyNo;
    private String cpyBr;
    private String applicantType;
    private VisitorApplicantDetail visitorApplicantDetail;
    private String residentQID;
    private String residentQidExpDte;
    private String newProfessionCode;
    private String notesArb;
    private String notesEng;
    private String locationId;
    private String userId;
    private List<RequiredDocument> requiredDocuments;

    // Getters and setters
}
