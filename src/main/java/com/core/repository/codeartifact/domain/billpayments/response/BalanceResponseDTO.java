package com.core.repository.codeartifact.domain.billpayments.response;

import com.core.repository.codeartifact.domain.billpayments.DetailDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceResponseDTO {

    private String item;

    private String clientId;

    private String expiration;

    private boolean partialPayment;

    private Long total;

    private List<DetailDTO> details;

    private Long amountMin;

    private Long amountMax;

    private boolean isPayment;

    private String message;

    private String account;

    private String client;

    private String code;

}
