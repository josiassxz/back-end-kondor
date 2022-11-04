package com.clientes.model.repository;

import com.clientes.model.entity.Cliente;
import com.clientes.model.filtro.ClienteFiltro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Locale;
import java.util.Objects;



