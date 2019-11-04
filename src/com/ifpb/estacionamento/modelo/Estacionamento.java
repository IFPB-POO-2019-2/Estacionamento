package com.ifpb.estacionamento.modelo;

import java.util.Arrays;

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

    public Veiculo[] getVeiculos(){
        return Arrays.copyOf(veiculos,quantidade);
        //outra solução
//        return Arrays.copyOfRange(veiculos, 0, quantidade);
    }

    public boolean remover(Veiculo veiculo){
        for(int i=0; i<quantidade;i++){
            if(veiculo.equals(veiculos[i])){
                for(int j=i;j<quantidade-1;j++){
                    veiculos[j] = veiculos[j+1];
                }
                quantidade--;
                return true;
            }
        }
        return false;
    }

    public Veiculo buscar(String placa){
        for(int i=0; i<quantidade;i++){
            if(veiculos[i].getPlaca().equals(placa)){
                return veiculos[i];
            }
        }
        return null;
    }

}
