package br.com.nome.dao.generic;

import br.com.nome.dao.Persistente;
import br.com.nome.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;


    public void excluir(E valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);


    public Collection<T> buscarTodos();
}
