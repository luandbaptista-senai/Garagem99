/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luan.garagem.controller;

import br.eti.luan.garagem.DTO.VeiculoMinDTO;
import br.eti.luan.garagem.entities.Veiculo;
import br.eti.luan.garagem.services.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */
@RestController
public class GaragemController {
    @Autowired
    private GaragemService garagemService;

@GetMapping("/forsale")
public List<VeiculoMinDTO> findAll() {
    List<VeiculoMinDTO> result = garagemService.findAll();
    return result;
} 
@GetMapping("/cor/{cor}")
public List<VeiculoMinDTO> findByCorIgnoreCase(@PathVariable String cor) {
    List<VeiculoMinDTO> result = garagemService.findByCorIgnoreCase(cor);
    return result;
} 


}