package DAO;

import modelo.Adocao;
import modelo.mausTratos;

public class Teste {
public static void main(String[] args) {
	DAOGenerico dao = new DAOGenerico();
	mausTratos m = new mausTratos();
	m.setCidade("");
	m.setDescricaoAnimal("");
	m.setAltitude(1.);
	m.setEndereco("");
	m.setNomeAnunciante("");
	m.setLongitude(1.);
	dao.inserir(m);
}
	
}
