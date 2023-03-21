package es.codeurjc.web.service;

import java.util.List;
import java.util.Optional;

import es.codeurjc.web.model.Producto;
import es.codeurjc.web.model.Usuario;
import es.codeurjc.web.repository.ProductoRepository;
import es.codeurjc.web.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Optional<Usuario> findById(long id) {
        return repository.findById(id);
    }

    public boolean exist(long id) {
        return repository.existsById(id);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public void save(Usuario usuario) {
        repository.save(usuario);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
