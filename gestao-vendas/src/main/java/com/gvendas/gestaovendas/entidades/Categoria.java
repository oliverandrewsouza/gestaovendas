package com.gvendas.gestaovendas.entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {


    @Id
    // esse @Id ele fala que esse atributo codigo é uma chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nome")
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Categoria other = (Categoria) obj;
        return codigo.equals(other.codigo) && nome.equals(other.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }
}
