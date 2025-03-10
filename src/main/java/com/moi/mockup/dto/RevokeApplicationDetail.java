package com.moi.mockup.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RevokeApplicationDetail {
    private String applicationNumber;          // Cancel Residency purpose application number
    private String QID;                        // QID
    private String nameEn;                     // English Name
    private String nameAr;                     // Arabic Name
    private String genderCode;                 // Gender code (1: Male, 2: Female)
    private String genderDescAr;               // Gender description in Arabic
    private String genderDescEn;               // Gender description in English
    private String passport;                   // Passport Number
    private String residentStatusCode;         // Resident Status code
    private String residentStatusDescEn;       // Resident Status description in English
    private String residentStatusDescAr;       // Resident Status description in Arabic
    private String residencePurposeCode;       // Residence purpose code
    private String residencePurposeDescEn;     // Residence purpose description in English
    private String residencePurposeDescAr;     // Residence purpose description in Arabic
    private String natCode;                    // ISO Nationality code
    private String natDescAr;                  // Nationality description in Arabic
    private String natDescEn;                  // Nationality description in English
    private String dateOfBirth;                // Date of Birth YYYY-MM-DD
    private String profCode;                   // Profession Code
    private String profDescAr;                 // Profession description in Arabic
    private String profDescEn;                 // Profession description in English
    private String residenceStartDate;         // Residence Start date YYYY-MM-DD
    private String residenceEndDate;           // Residence End date YYYY-MM-DD
    private String sponsorId;                  // Sponsor QID/EID
    private String sponsorNameAr;              // Sponsor Name in Arabic
    private String sponsorNameEn;              // Sponsor Name in English
    private String sponsorRelationCode;        // Relationship code with sponsor
    private String sponsorRelationDescEn;      // Sponsor relation description in English
    private String sponsorRelationDescAr;      // Sponsor relation description in Arabic
    private String remarksArb;                 // Notes/Remarks in Arabic
    private String remarksEng;                 // Notes/Remarks in English
    private Boolean hasSponsoredVisasOrQids;   // True if the resident has valid sponsored Visas or QIDs
    private String applicationStatusDescEn;    // Application Status description in English
    private String applicationStatusDescAr;    // Application Status description in Arabic
    private String applicationDate;            // Date of application
    private String applicationTime;            // Time of application
    private String remainingGracePeriodType;   // Grace period type (1: Day)
    private String remainingGracePeriodDuration; // Duration of grace period
    private Boolean applicationTransferredToSearchAndFollow; // Transfer status to search and follow-up
    private String transferredToSearchAndFollowDate;  // Date of transfer to search and follow-up
    private String allowedToCancel;            // Whether cancellation is allowed or not
    private String allowedToCancelRemarksArb;   // Remarks in Arabic on cancelation status
    private String allowedToCancelRemarksEng;   // Remarks in English on cancelation status

    // Getters and Setters
}


