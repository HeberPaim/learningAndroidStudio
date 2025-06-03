package com.example.firstapp;

import java.util.Arrays;
import java.util.List;

public class IMCAvaliador {
    static class CategoriaIMC {
        float limite;
        String descricao;

        CategoriaIMC(float limite, String descricao) {
            this.limite = limite;
            this.descricao = descricao;
        }
    }

    public static String avaliar(float imc, String sexo) {
        List<CategoriaIMC> categorias;

        if (sexo.equalsIgnoreCase("Homem")) {
            categorias = Arrays.asList(
                    new CategoriaIMC(18.5f, "Abaixo do peso"),
                    new CategoriaIMC(25.0f, "Peso normal"),
                    new CategoriaIMC(30.0f, "Sobrepeso"),
                    new CategoriaIMC(35.0f, "Obesidade grau I"),
                    new CategoriaIMC(40.0f, "Obesidade grau II"),
                    new CategoriaIMC(Float.MAX_VALUE, "Obesidade grau III")
            );
        } else {
            categorias = Arrays.asList(
                    new CategoriaIMC(18.0f, "Abaixo do peso"),
                    new CategoriaIMC(24.0f, "Peso normal"),
                    new CategoriaIMC(29.0f, "Sobrepeso"),
                    new CategoriaIMC(34.0f, "Obesidade grau I"),
                    new CategoriaIMC(39.0f, "Obesidade grau II"),
                    new CategoriaIMC(Float.MAX_VALUE, "Obesidade grau III")
            );
        }
        for (CategoriaIMC cat : categorias) {
            if (imc < cat.limite) {
                return cat.descricao;
            }
        }

        return "Erro na avaliação";
    }
}
