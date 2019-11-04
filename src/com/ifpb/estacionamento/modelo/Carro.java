package com.ifpb.estacionamento.modelo;

public class Carro extends Veiculo{

    private int passageiros;

    public Carro(String placa, String modelo, int ano, int passageiros){
        super(placa, modelo, ano);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
}
