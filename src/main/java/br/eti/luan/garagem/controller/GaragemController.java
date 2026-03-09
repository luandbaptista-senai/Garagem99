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
import org.springframework.http.ResponseEntity;
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
public ResponseEntity<List<VeiculoMinDTO>> findAll() {
    List<VeiculoMinDTO> result = garagemService.findAll();
    if(result.isEmpty()){
            //lista vazia
            // devolve 404
            return ResponseEntity.notFound().build();
            
        } else {
            // tem dados
            // devolve 200
            return ResponseEntity.ok(result);
        }
} 
@GetMapping("/color/{cor}")
public ResponseEntity<List<VeiculoMinDTO>> findByCorIgnoreCase(@PathVariable String cor) {
    List<VeiculoMinDTO> result = garagemService.findByCorIgnoreCase(cor);
    if(result.isEmpty()){
            //lista vazia
            // devolve 404
            return ResponseEntity.notFound().build();
            
        } else {
            // tem dados
            // devolve 200
            return ResponseEntity.ok(result);
        }
}    

@GetMapping("/year/{year}")
public ResponseEntity<List<VeiculoMinDTO>> findByAno(@PathVariable int year) {
    List<VeiculoMinDTO> result = garagemService.findByAno(year);
    if(result.isEmpty()){
            //lista vazia
            // devolve 404
            return ResponseEntity.notFound().build();
            
        } else {
            // tem dados
            // devolve 200
            return ResponseEntity.ok(result);
        }
   
} 

//    if(result.isEmpty()){
//            //lista vazia
//            // devolve 404
//            return ResponseEntity.notFound().build();
//            
//        } else {
//            // tem dados
//            // devolve 200
//            return ResponseEntity.ok(result);
//        }
//    
    


}