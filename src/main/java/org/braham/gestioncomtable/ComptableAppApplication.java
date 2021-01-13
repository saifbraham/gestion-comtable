package org.braham.gestioncomtable;



import org.braham.gestioncomtable.entities.Product;
import org.braham.gestioncomtable.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComptableAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComptableAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Computer",7600,34));
            productRepository.save(new Product(null,"Printer",1600,134));
            productRepository.save(new Product(null,"Smartphone",1600,34));
        };
    }

}
