package com.moi.mockup.controller;

import com.moi.mockup.dto.request.CancelApplicationRequest;
import com.moi.mockup.dto.request.GetRealestateApplicationsRequest;
import com.moi.mockup.dto.request.ReceiveRealestateApplicationRequest;
import com.moi.mockup.dto.response.CancelApplicationResponse;
import com.moi.mockup.dto.response.GetRealestateApplicationsResponse;
import com.moi.mockup.dto.response.ReceiveRealestateApplicationResponse;
import com.moi.mockup.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    @Autowired
    private ApplicationService realestateApplicationService;

    @PostMapping("/receive-application")
    public ResponseEntity<ReceiveRealestateApplicationResponse> receiveApplication(
            @RequestBody ReceiveRealestateApplicationRequest request) {

        ReceiveRealestateApplicationResponse response = realestateApplicationService.processApplication(request);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/get-applications")
    public ResponseEntity<GetRealestateApplicationsResponse> getRealestateApplications(
            @RequestBody GetRealestateApplicationsRequest request) {
        GetRealestateApplicationsResponse response = realestateApplicationService.getRealestateApplications(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/cancel-application")
    public ResponseEntity<CancelApplicationResponse> cancelApplications(
            @RequestBody CancelApplicationRequest request) {
        CancelApplicationResponse response = realestateApplicationService.cancelApplication(request);
        return ResponseEntity.ok(response);
    }


}
