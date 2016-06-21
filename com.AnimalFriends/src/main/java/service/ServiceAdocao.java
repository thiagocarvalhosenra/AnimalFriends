package service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import DAO.DAOGenerico;
import modelo.Adocao;

@Path("/WebServiceAdocao")
@ApplicationPath("/resource")
public class ServiceAdocao {
	@POST
	@Path ("/cadastroAdocao")
	public void cadastroAdocao(@FormParam("nomeAnunciante")String nomeAnunciante,
			@FormParam("estado") String estado,
			@FormParam("cidade")String cidade,
			@FormParam("telefoneAnunciante")String telefoneAnunciante,
			@FormParam("nome")String nome,
			@FormParam("descricaoAnimal")String descricaoAnimal,
			@FormParam("castrado")Boolean castrado,
			@FormParam("especie") String especie,
			@FormParam("idade")Integer idade,
			@FormParam("observacao") String observacao,
			@FormParam("raca")String raca,
			@FormParam("sexo")String sexo,
			@FormParam("pelagem")String pelagem,
			@FormParam("portePeso") String portePeso
			
			
			
			)
			
	{
	
		DAOGenerico dao = new DAOGenerico();
		Adocao ad = new Adocao();
		ad.setDescricaoAnimal(descricaoAnimal);
		ad.setNomeAnunciante(nomeAnunciante);
		ad.setTelefoneAnunciante(telefoneAnunciante);
		ad.setNome(nome);
		ad.setEspecie(especie);
		ad.setSexo(sexo);
		ad.setPortePeso(portePeso);
		ad.setIdade(idade);
		ad.setPelagem(pelagem);
		ad.setRaca(raca);
		ad.setCastrado(castrado);		
		ad.setCidade(cidade);
		ad.setEstado(estado);
		dao.inserir(ad);
		System.out.println("Cadastrado");
		
	}

}
