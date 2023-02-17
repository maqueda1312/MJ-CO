package es.codeurjc.web.repository;


import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
