package es.codeurjc.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.codeurjc.web.model.CarritodeCompra;
import es.codeurjc.web.repository.CarritoRepository;

@Service
public class CarritoService {
    
    @Autowired
    private CarritoRepository repository;

    public Optional<CarritodeCompra> findById(long id) {
        return repository.findById(id);
    }

    public boolean exist(long id) {
        return repository.existsById(id);
    }

    public List<CarritodeCompra> findAll() {
        return repository.findAll();
    }

    public void save(CarritodeCompra carrito) {
        repository.save(carrito);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }


}
