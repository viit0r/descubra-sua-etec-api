package com.viit0r.descubrasuaetecapi.model.response.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {

    private String cdRetorno;

    private boolean sucesso;
}
