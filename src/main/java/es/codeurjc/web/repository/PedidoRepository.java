package es.codeurjc.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.codeurjc.web.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
