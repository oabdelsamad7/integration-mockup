package com.moi.mockup.dto.request;

import lombok.Data;
import java.util.List;

@Data
public class ApplicationInquiryRequest {
    private String cpyType;
    private String cpyNo;
    private String cpyBr;
    private String inquirymode;
    private String applicantType;
    private String applicationNumber;
    private String visaNumber;
    private String passport;
    private String natCode;
    private String residentQID;
    private String applicationFromDate;
    private String applicationToDate;
    private String applicationStatus;
    private String locationId;
    private String userId;
}
