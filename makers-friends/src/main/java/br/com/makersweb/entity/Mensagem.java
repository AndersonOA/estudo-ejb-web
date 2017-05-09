/**
 * 
 */
package br.com.makersweb.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_mensagem")
public class Mensagem extends DefaultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8734474986902998668L;

	@ManyToOne
	@JoinColumn(name = "remetente")
	private Pessoa remetente;

	@ManyToOne
	@JoinColumn(name = "destinatario")
	private Pessoa destinatario;
	private String titulo;
	private String conteudo;

	/**
	 * @return the remetente
	 */
	public Pessoa getRemetente() {
		return remetente;
	}

	/**
	 * @param remetente
	 *            the remetente to set
	 */
	public void setRemetente(Pessoa remetente) {
		this.remetente = remetente;
	}

	/**
	 * @return the destinatario
	 */
	public Pessoa getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario
	 *            the destinatario to set
	 */
	public void setDestinatario(Pessoa destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the conteudo
	 */
	public String getConteudo() {
		return conteudo;
	}

	/**
	 * @param conteudo
	 *            the conteudo to set
	 */
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
