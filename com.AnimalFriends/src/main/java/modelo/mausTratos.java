package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: mausTratos
 *
 */
@Entity

public class mausTratos implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String DescricaoAnimal;
	private String InformacoesContatos;
	private String cidade;
	private Double longitude;
	private Double altitude;
	private String nomeAnunciante;
	private String endereco;
	
	
	
	public String getNomeAnunciante() {
		return nomeAnunciante;
	}

	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDescricaoAnimal() {
		return DescricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		DescricaoAnimal = descricaoAnimal;
	}

	public String getInformacoesContatos() {
		return InformacoesContatos;
	}

	public void setInformacoesContatos(String informacoesContatos) {
		InformacoesContatos = informacoesContatos;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public mausTratos() {
		super();
	}
   
}
