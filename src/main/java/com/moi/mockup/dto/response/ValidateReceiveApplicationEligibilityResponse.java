package com.moi.mockup.dto.response;

import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.VisitorApplicantDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ValidateReceiveApplicationEligibilityResponse {
    private String allowedToApply;
    private String applicantType;
    private String notesEn;
    private String notesAr;
//    private ApplicationRequiredDocuments applicationRequiredDocuments;
    private ResidentApplicantDetail residentApplicantDetail;
    private VisitorApplicantDetail visitorApplicantDetail;

}

