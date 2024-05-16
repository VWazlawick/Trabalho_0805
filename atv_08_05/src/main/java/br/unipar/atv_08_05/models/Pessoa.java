/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_08_05.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author victo
 */

@Entity
public class Pessoa {
    @Id
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private Date dtNasc;
    private String sexo;
    private String signo;
    private String nmMae;
    private String nmPai;
    private String dsEmail;
    private String senha;
    private String cep;
    private String endereco;
    private String nrCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private Double altura;
    private Double peso;
    private String tpSanguineo;
    private String cor;

    
    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade, String cpf, String rg, Date dtNasc, String sexo, String signo, String nmMae, String nmPai, String dsEmail, String senha, String cep, String endereco, String nrCasa, String bairro, String cidade, String estado, String telefone, String celular, Double altura, Double peso, String tpSanguineo, String cor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.signo = signo;
        this.nmMae = nmMae;
        this.nmPai = nmPai;
        this.dsEmail = dsEmail;
        this.senha = senha;
        this.cep = cep;
        this.endereco = endereco;
        this.nrCasa = nrCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.tpSanguineo = tpSanguineo;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getNmMae() {
        return nmMae;
    }

    public void setNmMae(String nmMae) {
        this.nmMae = nmMae;
    }

    public String getNmPai() {
        return nmPai;
    }

    public void setNmPai(String nmPai) {
        this.nmPai = nmPai;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(String nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTpSanguineo() {
        return tpSanguineo;
    }

    public void setTpSanguineo(String tpSanguineo) {
        this.tpSanguineo = tpSanguineo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return "Pessoa{" + "id=" + id + ",\n nome=" + nome + ","
                + "\n idade=" + idade + ",\n"
                + " cpf=" + cpf + ",\n"
                + " rg=" + rg + ",\n"
                + " dtNasc=" + simpleDateFormat.format(dtNasc) + ",\n"
                + " sexo=" + sexo + ",\n"
                + " signo=" + signo + ",\n"
                + " nmMae=" + nmMae + ",\n"
                + " nmPai=" + nmPai + ",\n"
                + " dsEmail=" + dsEmail + ",\n"
                + " senha=" + senha + ",\n"
                + " cep=" + cep + ",\n"
                + " endereco=" + endereco + ",\n"
                + " nrCasa=" + nrCasa + ",\n"
                + " bairro=" + bairro + ",\n"
                + " cidade=" + cidade + ",\n"
                + " estado=" + estado + ",\n"
                + " telefone=" + telefone + ",\n"
                + " celular=" + celular + ",\n"
                + " altura=" + altura + ",\n"
                + " peso=" + peso + ",\n"
                + " tpSanguineo=" + tpSanguineo + ",\n"
                + " cor=" + cor + '}';
    }
    
    
    
}
