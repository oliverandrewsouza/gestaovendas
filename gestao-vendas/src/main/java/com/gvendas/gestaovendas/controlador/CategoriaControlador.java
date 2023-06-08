package com.gvendas.gestaovendas.controlador;

import com.gvendas.gestaovendas.entidades.Categoria;
import com.gvendas.gestaovendas.servico.CategoriaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // falar que é um controlador rest
@RequestMapping("/categoria") // no endpoint vamos chamar de localhost/8080/categoria
public class CategoriaControlador {
    //classe que vai receber os endpoints da nossa API

    @Autowired
    private CategoriaServico categoriaServico;

    @GetMapping
    public List<Categoria> listarTodas(){
        return categoriaServico.listarTodas();
    }

    @GetMapping("/{categoria}")// toda vez que passa um atributo ou valor na requisicao na API, precisa anotar com @PATHVARIABLE
    public ResponseEntity<Optional<Categoria>> buscarPorId(@PathVariable  Long codigo){
     Optional<Categoria> categoria = categoriaServico.buscarPorId(codigo);
     return categoria.isPresent() ? ResponseEntity.ok(categoria) : ResponseEntity.badRequest().build();
    }
}
