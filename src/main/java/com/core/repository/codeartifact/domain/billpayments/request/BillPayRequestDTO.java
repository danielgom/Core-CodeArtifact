package com.core.repository.codeartifact.domain.billpayments.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillPayRequestDTO {

    @NotBlank(message = "providerId is required")
    private String providerId;

    @NotBlank(message = "reference is required")
    private String reference;

    @NotBlank(message = "userId is required")
    private String userId;

    private Long partialPayment;

    private String couponId;
}
