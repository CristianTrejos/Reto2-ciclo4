/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.ciclo4.servicio;

import co.edu.usa.ciclo4.modelo.Accessory;
import co.edu.usa.ciclo4.repositorio.AccessoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HeerJHobby
 */
@Service
public class AccessoryService {

    @Autowired
    private AccessoryRepository metodosCrud;

    //@Transactional (readOnly = true)
    public List<Accessory> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Accessory> getAccessory(String accesorioId) {
        return metodosCrud.getAccessory(accesorioId);
    }

    public Accessory save(Accessory accesorio) {

            if (accesorio.getReference() == null) {
            return accesorio;
            } else {
                return accesorio;
            }
       
    }

    public Accessory updateAccessory(Accessory accesorio) {
            Optional<Accessory> accessoryNew = metodosCrud.getAccessory(accesorio.getReference());
            if (accessoryNew.isPresent()) {
                 if (accesorio.getBrand()!= null) {
                accessoryNew.get().setBrand(accesorio.getBrand());
                 }
                 if (accesorio.getCategory() != null) {
                accessoryNew.get().setCategory(accesorio.getCategory());
                 }
                 if (accesorio.getMaterial() != null) {
                accessoryNew.get().setMaterial(accesorio.getMaterial());
                 }
                 if (accesorio.getGender() != null) {
                accessoryNew.get().setGender(accesorio.getGender());
                 }
                 if (accesorio.getSize() != null) {
                accessoryNew.get().setSize(accesorio.getSize());
                 }
                  if (accesorio.getDescription() != null) {
                accessoryNew.get().setDescription(accesorio.getDescription());
                }
                if (accesorio.getAvailability() != null) {
                accessoryNew.get().setAvailability(accesorio.getAvailability());
                }
                if (accesorio.getPrice() != 0.0) {
                accessoryNew.get().setPrice(accesorio.getPrice());
                }
                if (accesorio.getQuantity() != 0) {
                accessoryNew.get().setQuantity(accesorio.getQuantity());
                }
                 if (accesorio.getPhotography() != null) {
                accessoryNew.get().setPhotography(accesorio.getPhotography());
                 }
                metodosCrud.save(accessoryNew.get());
                return accessoryNew.get();
            } else {
                return accesorio;
            }   
    }
    
    public boolean deleteAccessory(String referencia) {
        Boolean aBoolean = getAccessory(referencia).map(accesorio -> {
            metodosCrud.deleteAccesory(accesorio);
            return true;
        }).orElse(false);
        return aBoolean;
    } 
    
}
