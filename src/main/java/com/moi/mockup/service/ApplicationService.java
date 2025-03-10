package com.moi.mockup.service;

import com.moi.mockup.dto.request.ApplicationInquiryRequest;
import com.moi.mockup.dto.request.CancelApplicationRequest;
import com.moi.mockup.dto.request.GetRealestateApplicationsRequest;
import com.moi.mockup.dto.request.ReceiveRealestateApplicationRequest;
import com.moi.mockup.dto.response.ApplicationInquiryResponse;
import com.moi.mockup.dto.response.CancelApplicationResponse;
import com.moi.mockup.dto.response.GetRealestateApplicationsResponse;
import com.moi.mockup.dto.response.ReceiveRealestateApplicationResponse;
import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.VisitorApplicantDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ApplicationService {

    public ReceiveRealestateApplicationResponse processApplication(ReceiveRealestateApplicationRequest request) {
        ReceiveRealestateApplicationResponse response = new ReceiveRealestateApplicationResponse();

        // Validate applicantType
        if ("05".equals(request.getApplicantType()) && request.getVisitorApplicantDetail() == null) {
            throw new IllegalArgumentException("VisitorApplicantDetail is mandatory for Visitor applicant types.");
        }
        if ("01".equals(request.getApplicantType()) && request.getResidentQID() == null) {
            throw new IllegalArgumentException("ResidentQID is mandatory for Resident applicant types.");
        }

        // Mock process to determine success or failure
        response.setProcessStatusCode("1");  // Assuming success
        response.setProcessStatusDescArb("نجاح العملية");
        response.setProcessStatusDescEng("Process success");

        // Mock values for other fields
        response.setApplicationNumber("123456789012");
        response.setApplicantType(request.getApplicantType());
        response.setApplicationStatusDesEn("Application received");
        response.setApplicationStatusDesAr("تم استلام الطلب");
        // other response fields...

        return response;
    }

    private List<ResidentApplicantDetail> getResidentApplications(GetRealestateApplicationsRequest request) {
        // Logic to fetch resident applications based on the filters in the request
        // This can be a database call or API call to retrieve the data
        return new ArrayList<>();
    }

    private List<VisitorApplicantDetail> getVisitorApplications(GetRealestateApplicationsRequest request) {
        // Logic to fetch visitor applications based on the filters in the request
        // This can be a database call or API call to retrieve the data
        return new ArrayList<>();
    }

    public GetRealestateApplicationsResponse getRealestateApplications(GetRealestateApplicationsRequest request) {
        GetRealestateApplicationsResponse response = new GetRealestateApplicationsResponse();

        // Depending on the inquiry mode, fetch data
        if ("2".equals(request.getInquirymode()) || "4".equals(request.getInquirymode())) {
            // Fetch applications for specific resident or by application number
            List<ResidentApplicantDetail> residentApplications = getResidentApplications(request);
            response.setResidentApplications(residentApplications);
        }

        if ("3".equals(request.getInquirymode()) || "4".equals(request.getInquirymode())) {
            // Fetch applications for specific visitor or by application number
            List<VisitorApplicantDetail> visitorApplications = getVisitorApplications(request);
            response.setVisitorApplications(visitorApplications);
        }

        // Optional: Add remarks or notes
        response.setNotesAr("ملاحظات باللغة العربية");
        response.setNotesEn("Remarks in English");

        return response;
    }
    public CancelApplicationResponse cancelApplication(CancelApplicationRequest request) {
        // Mock implementation for demonstration purposes
        CancelApplicationResponse response = new CancelApplicationResponse();

        response.setProcessStatusCode("VHB000");
        response.setProcessStatusDescArb("تم إلغاء الطلب بنجاح");
        response.setProcessStatusDescEng("Application was canceled successfully");
        response.setApplicationNumber(request.getApplicationNumber());
        response.setApplicationStatusDesEn("Canceled");
        response.setApplicationStatusDesAr("تم الإلغاء");
        response.setVisaNumber("123456789012");
        response.setVisaStatusDesEn("Visa canceled");
        response.setVisaStatusDesAr("تم إلغاء التأشيرة");
        response.setResidentQID(request.getResidentQID());
        response.setNotesAr(request.getNotesArb());
        response.setNotesEn(request.getNotesEng());

        return response;
    }
    public ApplicationInquiryResponse getApplications(ApplicationInquiryRequest request) {
        // Mock response logic for demonstration
        ApplicationInquiryResponse response = new ApplicationInquiryResponse();

        // Mock data for residents
        ResidentApplicantDetail resident = new ResidentApplicantDetail();
        resident.setApplicationNumber("123456782");
        resident.setQid("98765432101");
        resident.setNameEn("John Doe");
        resident.setResidentStatusCode("Approved");
        resident.setSubmissionDate(new Date());

        // Mock data for visitors
        VisitorApplicantDetail visitor = new VisitorApplicantDetail();
        visitor.setApplicationNumber("987654321012");
        visitor.setVisaNumber("123456789012");
        visitor.setPassportNumber("A1234567");
        visitor.setNatCode("US");
        visitor.setVisitorApplicationStatusEnglish("Pending");
        visitor.setSubmissionDate(new Date());

        response.setResidentApplicantDetails(Collections.singletonList(resident));
        response.setVisitorApplicantDetails(Collections.singletonList(visitor));
        response.setNotesAr("ملاحظات باللغة العربية");
        response.setNotesEn("Notes in English");

        return response;
    }
}
