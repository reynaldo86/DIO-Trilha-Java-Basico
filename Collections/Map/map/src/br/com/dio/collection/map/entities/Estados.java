package br.com.dio.collection.map.entities;

import java.util.Objects;

public class Estados {
    private String estado;
    private Integer populacao;

    public Estados() {
    }

    public Estados(String estado, Integer populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados estados = (Estados) o;
        return estado.equals(estados.estado) && populacao.equals(estados.populacao);
    }

    @Override
    public String toString() {
        return "Estados{" +
                "estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, populacao);
    }
}
