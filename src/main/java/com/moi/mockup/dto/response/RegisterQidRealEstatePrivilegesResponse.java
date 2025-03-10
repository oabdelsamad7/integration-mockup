package com.moi.mockup.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterQidRealEstatePrivilegesResponse {


    private String processStatusCode;
    private String processStatusDescArb;
    private String processStatusDescEng;

    }
