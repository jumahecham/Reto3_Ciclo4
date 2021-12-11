package Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces;

import Reto3DEFINITIVO.Reto3DEFINITIVO.modelo.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {
    
}
