/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.luan.garagem.services;

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
    
    public List<Veiculo> findAll() {
    List<Veiculo> result = garagemRepository.findAll();
            return result;
    }
    
}
