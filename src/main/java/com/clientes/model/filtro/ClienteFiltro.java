package com.clientes.model.filtro;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ClienteFiltro {

String nome;
String deveKg;
String deveDinheiro;
String deveBoleto;
String haverSucata;
Date ultimaAlteracao;


}
