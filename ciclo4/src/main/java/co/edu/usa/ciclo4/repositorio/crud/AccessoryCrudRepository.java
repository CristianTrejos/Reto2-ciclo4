/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.ciclo4.repositorio.crud;

import co.edu.usa.ciclo4.modelo.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author HeerJHobby
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String>{
   
}
