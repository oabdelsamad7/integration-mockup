package com.moi.mockup.controller;

import com.moi.mockup.dto.request.ValidateReceiveApplicationEligibilityRequest;
import com.moi.mockup.dto.response.ValidateReceiveApplicationEligibilityResponse;
import com.moi.mockup.service.EligibilityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eligibility")
public class EligibilityController {

    private final EligibilityService eligibilityService;

    public EligibilityController(EligibilityService eligibilityService) {
        this.eligibilityService = eligibilityService;
    }

    @PostMapping("/validate")
    public ResponseEntity<ValidateReceiveApplicationEligibilityResponse> validateEligibility(
            @RequestBody ValidateReceiveApplicationEligibilityRequest request) {

        ValidateReceiveApplicationEligibilityResponse response = eligibilityService.validateEligibility(request);
        return ResponseEntity.ok(response);
    }
}
