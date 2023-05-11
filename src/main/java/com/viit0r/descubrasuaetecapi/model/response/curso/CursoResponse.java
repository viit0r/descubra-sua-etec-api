package com.viit0r.descubrasuaetecapi.model.response.curso;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.viit0r.descubrasuaetecapi.model.dto.CursoDTO;
import com.viit0r.descubrasuaetecapi.model.response.util.MessageResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor

public class CursoResponse extends MessageResponse implements Serializable {

    public CursoResponse(List<CursoDTO> cursos, String cdRetorno, boolean sucesso) {
        super(cdRetorno, sucesso);
        this.cursos = cursos;
    }

    public CursoResponse(CursoDTO curso, String cdRetorno, boolean sucesso) {
        super(cdRetorno, sucesso);
        this.curso = curso;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<CursoDTO> cursos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CursoDTO curso;
}
