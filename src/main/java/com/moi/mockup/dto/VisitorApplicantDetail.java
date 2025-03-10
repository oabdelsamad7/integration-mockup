package com.moi.mockup.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VisitorApplicantDetail {
    private String visaNumber;
    private String passportNumber;
    private String passportType;
    private String passportTypeDescEn;
    private String passportTypeDescAr;
    private String passportSubType;
    private String passportExpiryDate;
    private String passportIssueCountryCode;
    private String passportIssueCountryDesEn;
    private String passportIssueCountryDesAr;
    private String passportIssueDate;
    private String countryOfBirth;
    private String genderCode;
    private String genderDescAr;
    private String genderDescEn;
    private String natCode;
    private String natDescAr;
    private String natDescEn;
    private String profCode;
    private String profDescAr;
    private String profDescEn;
    private String dateOfBirth;
    private String brirthCity;
    private Name name;
    private String phoneNumberQatar;
    private String address;
    private String visaType;
    private String visaTypeDesEn;
    private String visaTypeDesAr;
    private String visaPurpose;
    private String visaPurposeDesEn;
    private String visaPurposeDesAr;
    private String visaExpiryDate;
    private String visaStayExpiryDate;
    private String visaStatusCode;
    private String visaStatusDesEn;
    private String visaStatusDesAr;
    private VisitorEditing visitorEditing;
    private String VisitorApplicationNumber;
    private String VisitorApplicationStatusArabic;
    private String VisitorApplicationStatusEnglish;
    private String allowedToCancel;
    private String ApplicationNumber;
    private Date SubmissionDate;

    // Getters and setters
}
