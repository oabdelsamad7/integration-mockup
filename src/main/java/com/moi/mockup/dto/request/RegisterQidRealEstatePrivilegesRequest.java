package com.moi.mockup.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterQidRealEstatePrivilegesRequest {


    private String cpyType;
    private String cpyNo;
    private String cpyBr;
    private String residentQid;
    private String registerFlag;
    private String locationId;
    private String userId;
    private String remarksEg;
    private String remarksAr;

   }
