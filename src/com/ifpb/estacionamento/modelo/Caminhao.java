package com.ifpb.estacionamento.modelo;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(String placa, String modelo, int ano, int eixos) {
        super(placa, modelo, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

}
