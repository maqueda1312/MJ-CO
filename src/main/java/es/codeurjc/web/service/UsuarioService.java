package es.codeurjc.web.service;

import java.util.List;
import java.util.Optional;

import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "usuarios")
public class UsuarioService {
	
    @Autowired
    private UsuarioRepository repository;
    
    @Cacheable
    public Optional<Usuario> findById(long id) {
        return repository.findById(id);
    }
    
    @Cacheable
    public boolean exist(long id) {
        return repository.existsById(id);
    }
    @Cacheable
    public List<Usuario> findAll() {
        return repository.findAll();
    }
    @CacheEvict(allEntries = true)
    public void save(Usuario usuario) {
        repository.save(usuario);
    }
    @CacheEvict(allEntries = true)
    public void delete(long id) {
        repository.deleteById(id);
    }
  
}
