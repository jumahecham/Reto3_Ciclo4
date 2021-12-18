/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3DEFINITIVO.Reto3DEFINITIVO.repositorio;

import Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces.InterfaceChocolate;
import Reto3DEFINITIVO.Reto3DEFINITIVO.modelo.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */
@Repository
public class ChocolateRepository {
    @Autowired
    private InterfaceChocolate repository;

    public List<Chocolate> getAll() {
        return repository.findAll();
    }

    public Optional<Chocolate> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Chocolate create(Chocolate clothe) {
        return repository.save(clothe);
    }

    public void update(Chocolate clothe) {
        repository.save(clothe);
    }
    
    public void delete(Chocolate clothe) {
        repository.delete(clothe);
    }
    public List<Chocolate> getByPrice(Double price) {
        return repository.findByPrice(price);
    }
    public List<Chocolate> getByDescriptionContains(String description) {
        return repository.findByDescriptionContainingIgnoreCase(description);
    }
}
