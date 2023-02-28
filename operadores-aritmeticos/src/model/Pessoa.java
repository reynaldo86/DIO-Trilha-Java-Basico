package model;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private char  sexo;
    private boolean doadorOrgao;
    //private Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double peso, char sexo, boolean doadorOrgao) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.doadorOrgao = true;
        //this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isDoadorOrgao() {
        return doadorOrgao;
    }

    public void setDoadorOrgao(boolean doadorOrgao) {
        this.doadorOrgao = doadorOrgao;
    }

//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome= '" + nome + '\'' +
                ",\nidade= " + idade +
                ",\npeso= " + peso +
                ",\nsexo= " + sexo +
                ",\ndoadorOrgao= " + doadorOrgao +

                '}';
    }
}
