/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3DEFINITIVO.Reto3DEFINITIVO.repositorio;

import Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces.InterfaceOrder;
import Reto3DEFINITIVO.Reto3DEFINITIVO.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    @Autowired
    private InterfaceOrder orderCrudRepository;

    public List<Order> getAll() {
        return orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }
    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }
    
    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }
    public List<Order> getOrderByZone(String zone) {
        return orderCrudRepository.findBySalesManZone(zone);
    }
}  