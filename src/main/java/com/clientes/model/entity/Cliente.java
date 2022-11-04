package com.clientes.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    //@NotEmpty(message = "{campo.nome.obrigatorio}")
    //@JsonFormat(pattern = "dd/MM/yyyy")
    private String cliente;

    @Column(nullable = false, length = 255)
    // @NotEmpty(message = "{campo.semana.obrigatorio}")
    private String deveKg;

    @Column(nullable = false, length = 255)
    // @NotEmpty(message = "{campo.cidade.obrigatorio}")
    private String deveDinheiro;

    @Column(nullable = false, length = 255)
    // @NotEmpty(message = "{campo.cidade.obrigatorio}")
    private String deveBoleto;

    @Column(nullable = false, length = 255)
    // @NotEmpty(message = "{campo.tipoprocesso.obrigatorio}")
    private String haverSucata;

    @Column(nullable = false, length = 255)
    // @NotEmpty(message = "{campo.numeroEmbarcacao.obrigatorio}")
    private Date ultimaAlteracao;



}
