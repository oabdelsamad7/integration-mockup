package com.moi.mockup.dto.request;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetRealestateApplicationsRequest {
    private String cpyType;            // Company Type – Ministry of Justice (MOJ)
    private String cpyNo;              // Company Number - Ministry of Justice (MOJ)
    private String cpyBr;              // Company Branch - Ministry of Justice (MOJ)
    private String inquirymode;        // Inquiry Mode
    private String applicantType;      // Resident or Visitor
    private String applicationNumber;  // Application Number (Optional)
    private String visaNumber;         // Visa Number (Optional, if applicant is Visitor)
    private String passport;           // Passport (Optional, if applicant is Visitor)
    private String natCode;            // National Code (Optional, if applicant is Visitor)
    private String residentQID;        // Resident QID (Optional, if applicant is Resident)
    private String applicationFromDate; // Application from date range (YYYY-MM-DD)
    private String applicationToDate;  // Application to date range (YYYY-MM-DD)
    private String applicationStatus;  // Application status code
    private String locationId;         // Calling location Id
    private String userId;             // User ID

    // Getters and Setters
}
