/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luan.garagem.DTO;

import br.eti.luan.garagem.entities.Veiculo;
import jakarta.persistence.Column;

/**
 *
 * @author digma
 */
public class VeiculoMinDTO {
    private long id;
    
    private String marca;
    private String modelo;
    private String cor;
    
    private int ano;
    private int km;
    
    private String linkImagem;

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
    
    
    public VeiculoMinDTO(){}
    
   public VeiculoMinDTO(Veiculo veiculo){
   this.id = veiculo.getId();
   this.marca = veiculo.getMarca();
   this.modelo = veiculo.getModelo();
   this.cor = veiculo.getCor();
   this.ano = veiculo.getAno();
   this.km = veiculo.getKm();
   this.linkImagem = veiculo.getLinkImagem();
   
   }
}
