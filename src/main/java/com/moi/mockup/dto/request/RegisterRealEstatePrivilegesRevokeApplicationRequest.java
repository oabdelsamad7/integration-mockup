package com.moi.mockup.dto.request;



import lombok.Data;


@Data
public class RegisterRealEstatePrivilegesRevokeApplicationRequest {


    private String cpyType;

    private String cpyNo;

    private String cpyBr;

    private String actionType;

    private String cancelRPPurposeAplRefNumber; // Optional if actionType is '1'

    private String residentQID;

    private String remarksEng;

    private String remarksArb;

    private String locationId;

    private String userId;
}
