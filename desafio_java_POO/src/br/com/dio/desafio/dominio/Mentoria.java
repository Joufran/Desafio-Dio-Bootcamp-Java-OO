package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    

    @Override
    public double calcularXp() {
        return 30.0D;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
    @Override
    public String toString() {
        String var10000 = this.getTitulo();
        return "Mentoria{titulo='" + var10000 + "', descricao='" + this.getDescricao() + "', data=" + this.data + "}";
    }

   
} 

