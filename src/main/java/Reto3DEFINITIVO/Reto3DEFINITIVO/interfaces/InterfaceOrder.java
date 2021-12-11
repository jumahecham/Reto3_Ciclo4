/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces;

import Reto3DEFINITIVO.Reto3DEFINITIVO.modelo.Order;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author juanp
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}