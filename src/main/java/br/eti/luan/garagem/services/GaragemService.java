/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luan.garagem.services;

import br.eti.luan.garagem.DTO.VeiculoMinDTO;
import br.eti.luan.garagem.entities.Veiculo;
import br.eti.luan.garagem.repositories.GaragemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//    }
//   
//    public List<Veiculo> findById(long id){
//        List<Veiculo> result = GaragemRepository.findByIDIgnoreCase(id);
//        return result
//    }
    

//    public List<VeiculoMinDTO> findAll() {
//    List<Veiculo> resultVeiculo = garagemRepository.findAll();
//    
//    List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
//            return resultDTO;

}
}
