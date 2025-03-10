package com.moi.mockup.dto.request;


import lombok.Data;

@Data
public class RegisterPropertyTitleDeedRequest {
    
    private String cpyType;
    
    private String cpyNo;
    
    private String cpyBr;
    private String applicationNumber;
    private String visaNumber;
    private String passport;
    private String natCode;
    private String residentQid;

    private String titleDeedNumber;

    private String propertyLocationZone;

    private String propertyLocationStreet;
    
    private String propertyLocationBuilding;
    
    private String propertyLocationUnit;
    
    private String registerFlag;
    
    private String locationId;
    
    private String userId;
}
