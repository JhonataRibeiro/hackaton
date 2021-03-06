package com.stefanini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Agente;
import com.stefanini.model.Tipo;
import com.stefanini.service.TipoService;

@Path("/agente")
@RequestScoped
public class TipoController {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Agente> get(){
		List<Agente> agentes =  new ArrayList<Agente>();
		Agente agente1 = new Agente();
    	Agente agente2 = new Agente();
    	agente1.setIdAgente(1);
    	agente1.setNome("Jhonata Ribeiro");
    	
    	agente2.setIdAgente(2);
    	agente2.setNome("Luciana Santos");
    	
    	agentes.add(agente1);
    	agentes.add(agente2);
    	
    	return agentes;
		
	} 
    	
}
