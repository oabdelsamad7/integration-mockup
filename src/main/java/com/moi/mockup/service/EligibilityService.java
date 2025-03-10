package com.moi.mockup.service;

import com.moi.mockup.dto.Name;
import com.moi.mockup.dto.VisitorApplicantDetail;
import com.moi.mockup.dto.request.ValidateReceiveApplicationEligibilityRequest;
import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.response.ValidateReceiveApplicationEligibilityResponse;
import org.springframework.stereotype.Service;

@Service
public class EligibilityService {

    public ValidateReceiveApplicationEligibilityResponse validateEligibility(ValidateReceiveApplicationEligibilityRequest request) {
        // Implement the logic to determine eligibility here
        ValidateReceiveApplicationEligibilityResponse response = new ValidateReceiveApplicationEligibilityResponse();

        // Populate response with dummy data or actual validation logic
        response.setAllowedToApply("1");  // Example data
        response.setApplicantType(request.getApplicantType());
        response.setNotesEn("Eligibility validation passed.");
        response.setNotesAr("تم التحقق من الأهلية بنجاح.");

        if(request.getApplicantType().equals("01")) {

            ResidentApplicantDetail residentDetail = new ResidentApplicantDetail();


            residentDetail.setQid("12345678901");
            residentDetail.setNameEn("John Doe");
            residentDetail.setNameAr("جون دو");
            residentDetail.setGenderCode("1");
            residentDetail.setGenderDescEn("Male");
            residentDetail.setGenderDescAr("ذكر");
            response.setResidentApplicantDetail(residentDetail);
        }else{
            VisitorApplicantDetail visitorApplicantDetail = new VisitorApplicantDetail();
            Name name=new Name();
            name.setArabicName1("عمر");
            name.setEnglishName1("OAMR");
            visitorApplicantDetail.setName(name);
            response.setVisitorApplicantDetail(visitorApplicantDetail);
        }


        return response;
    }
}
