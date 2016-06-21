package modelo;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 *
 */
@Entity

public class Adocao implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpfAnunciante;
	private String descricaoAnimal;
	private String nomeAnunciante;
	private String telefoneAnunciante;
	private String especie;
	private String sexo;
	private String portePeso;
	private Integer idade;
	private String pelagem;
	private String raca;
	private Boolean castrado;
	private String dataCadastro;
	private String cidade;
	private String estado;
	
	private String observacao;
	
	
	
	

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfAnunciante() {
		return cpfAnunciante;
	}
	public void setCpfAnunciante(String cpfAnunciante) {
		this.cpfAnunciante = cpfAnunciante;
	}
	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}
	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}
	public String getNomeAnunciante() {
		return nomeAnunciante;
	}
	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}
	public String getTelefoneAnunciante() {
		return telefoneAnunciante;
	}
	public void setTelefoneAnunciante(String telefoneAnunciante) {
		this.telefoneAnunciante = telefoneAnunciante;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPortePeso() {
		return portePeso;
	}
	public void setPortePeso(String portePeso) {
		this.portePeso = portePeso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Boolean getCastrado() {
		return castrado;
	}
	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Adocao() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	
   
}
