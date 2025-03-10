package com.moi.mockup.dto.response;

import lombok.Data;

@Data
public class CancelApplicationResponse {
    private String processStatusCode;        // e.g., VHB000
    private String processStatusDescArb;     // Status message in Arabic (e.g., تم إلغاء الطلب بنجاح)
    private String processStatusDescEng;     // Status message in English (e.g., Application was canceled successfully)
    private String applicationNumber;        // Application number
    private String applicationStatusDesEn;   // Application Status description in English
    private String applicationStatusDesAr;   // Application Status description in Arabic
    private String visaNumber;               // Visa number (if applicantType is Visitor)
    private String visaStatusDesEn;          // Visa status description in English
    private String visaStatusDesAr;          // Visa status description in Arabic
    private String residentQID;              // Resident QID
    private String notesAr;                  // Notes/Remarks in Arabic
    private String notesEn;                  // Notes/Remarks in English
}
