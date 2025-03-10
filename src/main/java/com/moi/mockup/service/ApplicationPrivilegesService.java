package com.moi.mockup.service;

import com.moi.mockup.dto.ResidentApplicantDetail;
import com.moi.mockup.dto.RevokeApplicationDetail;
import com.moi.mockup.dto.request.GetRealEstatePrivilegesRevokeApplicationsRequest;
import com.moi.mockup.dto.request.GetResidentsWithRealEstatePrivilegesRequest;
import com.moi.mockup.dto.request.RegisterQidRealEstatePrivilegesRequest;
import com.moi.mockup.dto.request.RegisterRealEstatePrivilegesRevokeApplicationRequest;
import com.moi.mockup.dto.response.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationPrivilegesService {

    // Simulate a repository or data source for residents
    private List<ResidentApplicantDetail> getResidentsFromDataSource(String inquirymode, String residentQID) {
        // This is just a placeholder for actual database calls or service invocations
        List<ResidentApplicantDetail> residents = new ArrayList<>();

        if ("1".equals(inquirymode)) {
            // Fetch residents who are real-estate owners
            // Populate list with data from the database
        } else if ("2".equals(inquirymode)) {
            // Fetch residents who are real-estate beneficiaries
        } else if ("3".equals(inquirymode)) {
            // Fetch residents who have property privileges
        } else if ("4".equals(inquirymode) && residentQID != null) {
            // Fetch details for a specific resident
        }

        return residents;
    }

    public GetResidentsWithRealEstatePrivilegesResponse getResidentsWithRealEstatePrivileges(GetResidentsWithRealEstatePrivilegesRequest request) {
        GetResidentsWithRealEstatePrivilegesResponse response = new GetResidentsWithRealEstatePrivilegesResponse();
        List<ResidentApplicantDetail> residents = getResidentsFromDataSource(request.getInquirymode(), request.getResidentQID());

        response.setResidents(residents);
        response.setInquirymode(request.getInquirymode());

        // Optional: Adding remarks or notes
        response.setNotesArb("ملاحظات باللغة العربية");
        response.setNotesEng("Remarks in English");

        return response;
    }
    public RegisterQidRealEstatePrivilegesResponse handlePrivileges(
            RegisterQidRealEstatePrivilegesRequest request) {
        try {
            // Business logic for inserting or removing privileges
            if ("1".equals(request.getRegisterFlag())) {
                // Insert privilege logic
                return new RegisterQidRealEstatePrivilegesResponse(
                        "1",
                        "تم إضافة الامتياز بنجاح",
                        "Privilege added successfully"
                );
            } else if ("2".equals(request.getRegisterFlag())) {
                // Remove privilege logic
                return new RegisterQidRealEstatePrivilegesResponse(
                        "1",
                        "تم إزالة الامتياز بنجاح",
                        "Privilege removed successfully"
                );
            } else {
                throw new IllegalArgumentException("Invalid registerFlag value");
            }
        } catch (Exception e) {
            // Handle failure
            return new RegisterQidRealEstatePrivilegesResponse(
                    "0",
                    "فشلت العملية",
                    "Operation failed"
            );
        }
    }

    public RegisterRealEstatePrivilegesRevokeApplicationResponse handleRevokeApplication(
            RegisterRealEstatePrivilegesRevokeApplicationRequest request) {

        // Mock business logic
        String processStatusCode = "1";
        String processStatusDescArb = "تم تسجيل التطبيق بنجاح";
        String processStatusDescEng = "Application registered successfully";
        String cancelRPPurposeAplRefNumber = "MOI123456789"; // Simulate generated reference
        String noteEng = "Operation completed successfully";
        String noteArb = "تمت العملية بنجاح";

        if ("0".equals(request.getActionType()) && request.getCancelRPPurposeAplRefNumber() == null) {
            throw new IllegalArgumentException("Reference number is required for rollback action.");
        }

        return new RegisterRealEstatePrivilegesRevokeApplicationResponse(
                processStatusCode,
                processStatusDescArb,
                processStatusDescEng,
                request.getResidentQID(),
                cancelRPPurposeAplRefNumber,
                noteEng,
                noteArb,
                request.getLocationId(),
                request.getUserId()
        );
    }
    public List<RevokeApplicationDetail> getRevokeApplications(GetRealEstatePrivilegesRevokeApplicationsRequest request) {
        List<RevokeApplicationDetail> applications = new ArrayList<>();

        // Dummy logic to fetch revoke applications based on the inquiryType
        if ("0".equals(request.getInquiryType())) {
            // Get all cancel residency purpose applications
            applications.add(createRevokeApplication("APPL123456", "12345678901", "John Doe", "ذكر", "Male"));
        } else if ("1".equals(request.getInquiryType()) && request.getResidentQID() != null) {
            // Get cancel residency purpose applications for a specific resident
            applications.add(createRevokeApplication("APPL123457", request.getResidentQID(), "Jane Doe", "أنثى", "Female"));
        } else if ("2".equals(request.getInquiryType()) && request.getCancelRPPurposeAplRefNumber() != null) {
            // Get cancel residency purpose application by reference number
            applications.add(createRevokeApplication(request.getCancelRPPurposeAplRefNumber(), "98765432101", "Alice Smith", "أنثى", "Female"));
        }

        return applications;
    }

    public GetRealEstatePrivilegesRevokeApplicationsResponse getRealEstatePrivilegesRevokeApplications(GetRealEstatePrivilegesRevokeApplicationsRequest request) {
        GetRealEstatePrivilegesRevokeApplicationsResponse response = new GetRealEstatePrivilegesRevokeApplicationsResponse();

        // Fetch revoke applications based on inquiry type
        List<RevokeApplicationDetail> revokeApplications = getRevokeApplications(request);

        response.setRevokeApplications(revokeApplications);
        response.setNotesArb("ملاحظات باللغة العربية");
        response.setNotesEng("Remarks in English");

        return response;
    }

    private RevokeApplicationDetail createRevokeApplication(String applicationNumber, String QID, String name, String genderDesc, String genderCode) {
        RevokeApplicationDetail application = new RevokeApplicationDetail();
        application.setApplicationNumber(applicationNumber);
        application.setQID(QID);
        application.setNameEn(name);
        application.setNameAr(name); // For simplicity, assuming same name in Arabic
        application.setGenderCode(genderCode);
        application.setGenderDescAr(genderDesc);
        application.setGenderDescEn(genderDesc);
        // Set other details...
        return application;
    }


    public RegisterQidRealEstatePrivilegesResponse registerRealEstatePrivileges(RegisterQidRealEstatePrivilegesRequest request) {
        RegisterQidRealEstatePrivilegesResponse response = new RegisterQidRealEstatePrivilegesResponse();
        try {
            // Validate inputs
            if (request.getCpyType() == null || request.getCpyNo() == null
                    || request.getCpyBr() == null || request.getRegisterFlag() == null
                    || request.getLocationId() == null || request.getUserId() == null) {
                response.setProcessStatusCode("0");
                response.setProcessStatusDescEng("Validation failed: Missing required fields");
                return response;
            }

            // Perform the operation based on registerFlag
            if ("1".equals(request.getRegisterFlag())) {
                // Logic to add QID to the privileges list
                response.setProcessStatusCode("1");
                response.setProcessStatusDescEng("QID added to privileges list successfully.");
            } else if ("2".equals(request.getRegisterFlag())) {
                // Logic to remove QID from the privileges list
                response.setProcessStatusCode("1");
                response.setProcessStatusDescEng("QID removed from privileges list successfully.");
            } else {
                response.setProcessStatusCode("0");
                response.setProcessStatusDescEng("Invalid registerFlag value.");
            }
        } catch (Exception e) {
            response.setProcessStatusCode("0");
            response.setProcessStatusDescEng("Error processing request: " + e.getMessage());
        }
        return response;

    }
}
