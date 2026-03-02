/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.luan.garagem.repositories;

import br.eti.luan.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long>{
    
    List<Veiculo> findByCorIgnoreCase(String color);
    
    List<Veiculo> findByAno(int year);
    
    //Veiculo findById(long id);
}
