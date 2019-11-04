package com.ifpb.estacionamento.visao;

import com.ifpb.estacionamento.modelo.*;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();

        estacionamento.adicionar(new Moto("XYZ-9999", "Fan",
                2015, 150));
        estacionamento.adicionar(new Caminhao("JJJ-8888","Volvo",
                2015, 4));
        estacionamento.adicionar(new Carro("ABC-3214","Fiat",
                2000,5));
        //Não irá inserir, pois a placa já está cadastrada
        estacionamento.adicionar(new Carro("ABC-3214","Fiat",
                2000,5));

        System.out.println(estacionamento.contTipo(Carro.class));

        System.out.println(Arrays.toString(estacionamento.getVeiculos()));

    }

}
