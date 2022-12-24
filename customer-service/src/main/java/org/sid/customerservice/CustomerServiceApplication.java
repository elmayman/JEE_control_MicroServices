package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRespository customerRespository, RepositoryRestConfiguration repositoryRestConfiguration){

        repositoryRestConfiguration.exposeIdsFor(Customer.class);
        return args ->{
            customerRespository.save(new Customer(null,"ayman", "ayman@gmail.com"));
            customerRespository.save(new Customer(null,"anouar", "anouar@hotmail.com"));
            customerRespository.save(new Customer(null,"inass", "inass@outlook.com"));
            customerRespository.save(new Customer(null,"bouchra", "bouchra@gmail.com"));
            customerRespository.save(new Customer(null,"ahmed", "ahmed@outlook.com"));
            customerRespository.findAll().forEach(c->{
                System.out.println(c.getName());
            });
        };
    }


}
