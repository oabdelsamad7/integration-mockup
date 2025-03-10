package com.moi.mockup.dto.response;

import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.VisitorApplicantDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GetRealestateApplicationsResponse {
    private List<ResidentApplicantDetail> residentApplications;
    private List<VisitorApplicantDetail> visitorApplications;
    private String notesAr;  // Notes in Arabic
    private String notesEn;  // Notes in English

    // Getters and Setters
}