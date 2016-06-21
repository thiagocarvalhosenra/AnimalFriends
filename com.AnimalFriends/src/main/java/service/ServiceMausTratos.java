package service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import DAO.DAOGenerico;
import modelo.mausTratos;

@Path("/WebServiceMausTratos")
@ApplicationPath("/resource")

public class ServiceMausTratos extends Application {
	@POST
	@Path("/cadastroMausTratos")
	public void cadastroMausTratos(
			@FormParam("endereco")String endereco,
			@FormParam("descricaoAnimal")String descricaoAnimal
			)
	{
		DAOGenerico dao = new DAOGenerico();
		mausTratos mt = new mausTratos();
		mt.setDescricaoAnimal(descricaoAnimal);
		mt.setEndereco(endereco);
		dao.inserir(mt);
	}
@GET
@Path("/hi")
public String hi(){
	return "hi";
}
}