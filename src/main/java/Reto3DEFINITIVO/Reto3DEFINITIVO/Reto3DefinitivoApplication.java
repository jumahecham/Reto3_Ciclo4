package Reto3DEFINITIVO.Reto3DEFINITIVO;


import Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces.InterfaceChocolate;
import Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces.InterfaceOrder;
import Reto3DEFINITIVO.Reto3DEFINITIVO.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@Component
@SpringBootApplication
public class Reto3DefinitivoApplication implements CommandLineRunner {

    @Autowired
    private InterfaceChocolate interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;
    public static void main(String[] args) {
        SpringApplication.run(Reto3DefinitivoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }

}
