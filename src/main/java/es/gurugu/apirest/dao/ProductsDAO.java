package es.gurugu.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.gurugu.apirest.entitys.Product;

//La interface Jpa tiene dos genericos, el primero es sobre que entidad va a trabajar y de que tipo es el ID
//Con esto ya tenemos implementado todo el CRUD de la entidad
public interface ProductsDAO extends JpaRepository<Product, Long> {

}
