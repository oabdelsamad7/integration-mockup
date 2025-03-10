package com.moi.mockup.controller;

import com.moi.mockup.dto.request.GetRealEstatePrivilegesRevokeApplicationsRequest;
import com.moi.mockup.dto.request.GetResidentsWithRealEstatePrivilegesRequest;
import com.moi.mockup.dto.request.RegisterQidRealEstatePrivilegesRequest;
import com.moi.mockup.dto.request.RegisterRealEstatePrivilegesRevokeApplicationRequest;
import com.moi.mockup.dto.response.GetRealEstatePrivilegesRevokeApplicationsResponse;
import com.moi.mockup.dto.response.GetResidentsWithRealEstatePrivilegesResponse;
import com.moi.mockup.dto.response.RegisterQidRealEstatePrivilegesResponse;
import com.moi.mockup.dto.response.RegisterRealEstatePrivilegesRevokeApplicationResponse;
import com.moi.mockup.service.ApplicationPrivilegesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/application-privileges")
public class ApplicationPrivilegesController {

    @Autowired
    private ApplicationPrivilegesService realEstatePrivilegesService;


    @PostMapping("/get-residents-Privileges")
    public ResponseEntity<GetResidentsWithRealEstatePrivilegesResponse> getResidentsWithRealEstatePrivileges(
            @RequestBody GetResidentsWithRealEstatePrivilegesRequest request) {
        GetResidentsWithRealEstatePrivilegesResponse response = realEstatePrivilegesService.getResidentsWithRealEstatePrivileges(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register-residents-Privileges")
    public ResponseEntity<RegisterQidRealEstatePrivilegesResponse> registerRealEstatePrivileges(
            @RequestBody RegisterQidRealEstatePrivilegesRequest request) {
        RegisterQidRealEstatePrivilegesResponse response = realEstatePrivilegesService.registerRealEstatePrivileges(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/revoke-application")
    public ResponseEntity<RegisterRealEstatePrivilegesRevokeApplicationResponse> handleRevokeApplication(
            @RequestBody RegisterRealEstatePrivilegesRevokeApplicationRequest request) {

        RegisterRealEstatePrivilegesRevokeApplicationResponse response = realEstatePrivilegesService.handleRevokeApplication(request);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/get-revoke-applications")
    public ResponseEntity<GetRealEstatePrivilegesRevokeApplicationsResponse> getRevokeApplications(
            @RequestBody GetRealEstatePrivilegesRevokeApplicationsRequest request) {
        GetRealEstatePrivilegesRevokeApplicationsResponse response = realEstatePrivilegesService.getRealEstatePrivilegesRevokeApplications(request);
        return ResponseEntity.ok(response);
    }

}
