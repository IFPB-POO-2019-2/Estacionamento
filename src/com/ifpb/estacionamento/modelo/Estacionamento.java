package com.ifpb.estacionamento.modelo;

public class Estacionamento {

    /*
    TODO
    Criar segunda versão com capacidades
    específicas para cada tipo de veículo
     */

    private Veiculo[] veiculos;
    private int quantidade;

    public Estacionamento(){
        veiculos = new Veiculo[100];
        quantidade = 0;
    }

    public boolean adicionar(Veiculo veiculo){
        if(quantidade == veiculos.length){
            //indica que o array está lotado
            return false;
        }else{
            veiculos[quantidade++] = veiculo;
            return true;
        }
    }


}
