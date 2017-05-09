/**
 * 
 */
package br.com.makersweb.dao;

import java.util.List;

import br.com.makersweb.entity.Pessoa;

/**
 *
 * @author anderson.aristides
 *
 */
public interface IPessoaDAO {

	public Pessoa criar(String nome, int idade);

	public void atualizar(Pessoa pessoa);

	public List<Pessoa> recuperarTodas();

}
