package com.moi.mockup.dto.response;

import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.VisitorApplicantDetail;
import lombok.Data;
import java.util.List;

@Data
public class ApplicationInquiryResponse {
    private List<ResidentApplicantDetail> residentApplicantDetails;
    private List<VisitorApplicantDetail> visitorApplicantDetails;
    private String notesAr;
    private String notesEn;
}
