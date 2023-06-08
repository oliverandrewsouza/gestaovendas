package com.gvendas.gestaovendas.servico;

import com.gvendas.gestaovendas.entidades.Categoria;
import com.gvendas.gestaovendas.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServico {

    @Autowired // cria o objeto em tempo de execucao, se nao faz isso toma nullpoint em tempo de execucao por obj nulo
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> listarTodas(){
            return categoriaRepositorio.findAll();
    }

    public Optional<Categoria> buscarPorId(Long id){
        return categoriaRepositorio.findById(id);
    }

}
