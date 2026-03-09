/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luan.garagem.services;

import br.eti.luan.garagem.DTO.VeiculoMinDTO;
import br.eti.luan.garagem.entities.Veiculo;
import br.eti.luan.garagem.repositories.GaragemRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author digma
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<VeiculoMinDTO> findAll() {
    List<Veiculo> resultVeiculo = garagemRepository.findAll();
    List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
            return resultDTO;
    }
       
    /**
     *@param cor
     * @return
     */
    public List<VeiculoMinDTO> findByCorIgnoreCase(@PathVariable String cor) {
    List<Veiculo> resultVeiculo = garagemRepository.findByCorIgnoreCase(cor);
    List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
            return resultDTO;
    }
    /**
     *@param ano
     * @return
     */
    public List<VeiculoMinDTO> findByAno(@PathVariable int ano) {
    List<Veiculo> resultVeiculo = garagemRepository.findByAno(ano);
    List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
            return resultDTO;
    }
    
    public Optional<Veiculo> findById(long Id) {
        Optional<Veiculo> result = garagemRepository.findById(Id);
    
    return result;}
    
    
//    public Optional<Veiculo> findById(long id) {
//        return garagemRepository.findById(id);
//    }
    
    
    

//    public List<VeiculoMinDTO> findAll() {
//    List<Veiculo> resultVeiculo = garagemRepository.findAll();
//    
//    List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
//            return resultDTO;

}

