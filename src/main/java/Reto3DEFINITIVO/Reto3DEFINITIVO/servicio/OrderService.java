/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3DEFINITIVO.Reto3DEFINITIVO.servicio;
import Reto3DEFINITIVO.Reto3DEFINITIVO.modelo.Order;
import Reto3DEFINITIVO.Reto3DEFINITIVO.repositorio.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class OrderService {
     @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public Optional<Order> getOrder(int id) {
        
        return orderRepository.getOrder(id);
    }

    public Order create(Order order) {
        if (order.getId() == null) {
            return order;            
        }else {
            return orderRepository.create(order);
        }
    }

    public Order update(Order order) {

        if (order.getId() != null) {
            Optional<Order> orderDb = orderRepository.getOrder(order.getId());
            if (!orderDb.isEmpty()) {
                if (order.getRegisterDay() != null) {
                    orderDb.get().setRegisterDay(order.getRegisterDay());
                }
                if (order.getStatus() != null) {
                    orderDb.get().setStatus(order.getStatus());
                }
                if (order.getSalesMan() != null) {
                    orderDb.get().setSalesMan(order.getSalesMan());
                }
                if (order.getProducts() != null) {
                    orderDb.get().setProducts(order.getProducts());
                }
                if (order.getQuantities() != null) {
                    orderDb.get().setQuantities(order.getQuantities());
                }
                orderRepository.update(orderDb.get());
                return orderDb.get();
            } else {
                return order;
            }
        } else {
            return order;
        }
    }
    
    public boolean delete(int orderId) {
        return getOrder(orderId).map(order -> {
            orderRepository.delete(order);
            return true;
        }).orElse(false);
    }
    
    public List<Order> getOrderByZone(String zone){
        return orderRepository.getOrderByZone(zone);
    }
    public List<Order> getOrderBySalesmanId(Integer id){
        return orderRepository.getOrderBySalesmanId(id);
    }
    

}    