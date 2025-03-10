package com.moi.mockup.dto.response;

import com.moi.mockup.dto.ResidentApplicantDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetResidentsWithRealEstatePrivilegesResponse {
    private List<ResidentApplicantDetail> residents;
    private String inquirymode;
    private String notesArb;
    private String notesEng;

    // Getters and Setters
}
