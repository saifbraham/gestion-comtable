package org.braham.gestioncomtable.repositories;


import org.braham.gestioncomtable.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
