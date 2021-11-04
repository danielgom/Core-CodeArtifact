package com.core.repository.codeartifact.domain.catalogue.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {

    private String name;

    private String logo;

    private String logoUrl;

    private BankColorCodeDTO colorCode;

    private List<CardBinDTO> cardBinList;

}
