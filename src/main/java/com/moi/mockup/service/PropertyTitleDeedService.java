package com.moi.mockup.service;


import com.moi.mockup.domain.PropertyTitleDeed;
import com.moi.mockup.dto.request.RegisterPropertyTitleDeedRequest;
import org.springframework.stereotype.Service;

@Service
public class PropertyTitleDeedService {


    public PropertyTitleDeed registerPropertyTitleDeed(RegisterPropertyTitleDeedRequest request) {
        PropertyTitleDeed deed = new PropertyTitleDeed();
        deed.setCpyType(request.getCpyType());
        deed.setCpyNo(request.getCpyNo());
        deed.setCpyBr(request.getCpyBr());
        deed.setApplicationNumber(request.getApplicationNumber());
        deed.setVisaNumber(request.getVisaNumber());
        deed.setPassport(request.getPassport());
        deed.setNatCode(request.getNatCode());
        deed.setResidentQid(request.getResidentQid());
        deed.setTitleDeedNumber(request.getTitleDeedNumber());
        deed.setPropertyLocationZone(request.getPropertyLocationZone());
        deed.setPropertyLocationStreet(request.getPropertyLocationStreet());
        deed.setPropertyLocationBuilding(request.getPropertyLocationBuilding());
        deed.setPropertyLocationUnit(request.getPropertyLocationUnit());
        deed.setRegisterFlag(request.getRegisterFlag());
        deed.setLocationId(request.getLocationId());
        deed.setUserId(request.getUserId());


        return deed;
    }
}
