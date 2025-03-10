package com.moi.mockup.controller;


import com.moi.mockup.domain.PropertyTitleDeed;
import com.moi.mockup.dto.request.RegisterPropertyTitleDeedRequest;
import com.moi.mockup.service.PropertyTitleDeedService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/property-title-deeds")
public class PropertyTitleDeedController {

    private final PropertyTitleDeedService service;

    public PropertyTitleDeedController(PropertyTitleDeedService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<PropertyTitleDeed> registerPropertyTitleDeed(
            @Validated @RequestBody RegisterPropertyTitleDeedRequest request) {
        PropertyTitleDeed response = service.registerPropertyTitleDeed(request);
        return ResponseEntity.ok(response);
    }
}
