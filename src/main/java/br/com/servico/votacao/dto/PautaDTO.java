package br.com.servico.votacao.dto;

import br.com.servico.votacao.entity.Pauta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@ApiModel(value = "PautaDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PautaDTO {

    @ApiModelProperty(value = "Descrição referente o que será votado.", required = true)
    @NotBlank(message = "Descrição deve ser preenchido")
    private String descricao;

    public static Pauta toEntity(PautaDTO dto) {
        return Pauta.builder()
                .descricao(dto.getDescricao())
                .build();
    }

    public static PautaDTO toDTO(Pauta pauta) {
        return PautaDTO.builder()
                .descricao(pauta.getDescricao())
                .build();
    }
}
