package com.ifpb.estacionamento.modelo;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, String modelo, int ano, int cilindradas){
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
