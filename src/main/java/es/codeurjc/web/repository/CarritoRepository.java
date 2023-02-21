package es.codeurjc.web.repository;


import es.codeurjc.web.model.CarritodeCompra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<CarritodeCompra, Long> {

}