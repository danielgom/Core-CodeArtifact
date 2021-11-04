package com.core.repository.codeartifact.domain.catalogue.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardBinDTO {

    private String bin;

    private String cardType;

    private String cardBrand;
}
