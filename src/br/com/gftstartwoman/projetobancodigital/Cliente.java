package br.com.gftstartwoman.projetobancodigital;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Conta>contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
