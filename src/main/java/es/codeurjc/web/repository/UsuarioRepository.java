package es.codeurjc.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;

import java.util.List;
import java.util.Optional;

//@CacheConfig(cacheNames = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
    Optional<Usuario> findByName(String name);
}