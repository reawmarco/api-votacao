package br.com.servico.votacao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SessaoVotacaoAbrirDTO {

    @NotNull(message = "oidPauta deve ser preenchido")
    private Integer oidPauta;

    private Integer tempo;
}
