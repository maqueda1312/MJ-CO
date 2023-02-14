package es.codeurjc.web.service;

import java.util.List;
import java.util.Optional;

import es.codeurjc.web.model.Producto;
import es.codeurjc.web.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public Optional<Producto> findById(long id) {
        return repository.findById(id);
    }

    public boolean exist(long id) {
        return repository.existsById(id);
    }

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public void save(Producto producto) {
        repository.save(producto);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
