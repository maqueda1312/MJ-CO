package es.codeurjc.web.service;

import java.util.List;
import java.util.Optional;

import es.codeurjc.web.model.Producto;
import es.codeurjc.web.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;


@Service
@CacheConfig(cacheNames = "productos")
public class ProductoService {

    @Autowired
    private ProductoRepository repository;
    @Cacheable
    public Optional<Producto> findById(long id) {
        return repository.findById(id);
    }
    @Cacheable
    public boolean exist(long id) {
        return repository.existsById(id);
    }
    @Cacheable
    public List<Producto> findAll() {
        return repository.findAll();
    }
    @CacheEvict(allEntries = true)
    public void save(Producto producto) {
        repository.save(producto);
    }
    @CacheEvict(allEntries = true)
    public void delete(long id) {
        repository.deleteById(id);
    }
}
