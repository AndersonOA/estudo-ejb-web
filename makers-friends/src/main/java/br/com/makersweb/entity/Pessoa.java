/**
 * 
 */
package br.com.makersweb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_pessoas")
public class Pessoa extends DefaultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6506614917346489118L;

	private String nome;
	private String usuario;
	private String senha;
	private int idade;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_amizade", joinColumns = @JoinColumn(name = "convidado"), inverseJoinColumns = @JoinColumn(name = "convidante"))
	private List<Pessoa> convidantes;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_amizade", joinColumns = @JoinColumn(name = "convidante"), inverseJoinColumns = @JoinColumn(name = "convidado"))
	private List<Pessoa> convidados;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "remetente")
	private List<Mensagem> mensagensEnviadas;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "destinatario")
	private List<Mensagem> mensagensRecebidas;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the convidantes
	 */
	public List<Pessoa> getConvidantes() {
		return convidantes;
	}

	/**
	 * @param convidantes
	 *            the convidantes to set
	 */
	public void setConvidantes(List<Pessoa> convidantes) {
		this.convidantes = convidantes;
	}

	/**
	 * @return the convidados
	 */
	public List<Pessoa> getConvidados() {
		return convidados;
	}

	/**
	 * @param convidados
	 *            the convidados to set
	 */
	public void setConvidados(List<Pessoa> convidados) {
		this.convidados = convidados;
	}

	/**
	 * @return the mensagensEnviadas
	 */
	public List<Mensagem> getMensagensEnviadas() {
		return mensagensEnviadas;
	}

	/**
	 * @param mensagensEnviadas
	 *            the mensagensEnviadas to set
	 */
	public void setMensagensEnviadas(List<Mensagem> mensagensEnviadas) {
		this.mensagensEnviadas = mensagensEnviadas;
	}

	/**
	 * @return the mensagensRecebidas
	 */
	public List<Mensagem> getMensagensRecebidas() {
		return mensagensRecebidas;
	}

	/**
	 * @param mensagensRecebidas
	 *            the mensagensRecebidas to set
	 */
	public void setMensagensRecebidas(List<Mensagem> mensagensRecebidas) {
		this.mensagensRecebidas = mensagensRecebidas;
	}

}
