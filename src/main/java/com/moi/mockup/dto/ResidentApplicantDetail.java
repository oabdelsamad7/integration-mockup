package com.moi.mockup.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ResidentApplicantDetail {
    private String qid;
    private String nameEn;
    private String nameAr;
    private String genderCode;
    private String genderDescAr;
    private String genderDescEn;
    private String passport;
    private String residentStatusCode;
    private String residentStatusDescEn;
    private String residentStatusDescAr;
    private String residencePurposeCode;
    private String residencePurposeDescEn;
    private String residencePurposeDescAr;
    private String natCode;
    private String natDescAr;
    private String natDescEn;
    private String dateOfBirth;
    private String profCode;
    private String profDescAr;
    private String profDescEn;
    private String residenceStartDate;
    private String residenceEndDate;
    private String sponsorId;
    private String sponsorNameAr;
    private String sponsorNameEn;
    private String sponsorRelationCode;
    private String sponsorRelationDescEn;
    private String sponsorRelationDescAr;
    private String applicationNumber;
    private String[] applicationType;
    private String[] applicationTypeDescArb;
    private String[] applicationTypeDescEng;
    private String remarksArb;
    private String remarksEng;
    private String allowedToCancel;
    private boolean hasSponsoredVisasOrQids;
    private Date SubmissionDate;

    // Getters and setters
}
