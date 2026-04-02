package com.example.educore.service;

import com.example.educore.model.Registro;
import com.example.educore.repository.RegistroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegistroService {
    private final RegistroRepository repo;

    public RegistroService(RegistroRepository repo) {
        this.repo = repo;
    }

    public List<Registro> obtenerTodos() {
        return repo.findAll();
    }

    public Registro obtenerPorId(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + id));
    }

    public Registro crear(Registro reg) {

        if (reg.getId() != null && repo.existsById(reg.getId())) {
            throw new RuntimeException("El ID " + reg.getId() + " ya está registrado");
        }
        return repo.save(reg);
    }

    public Registro actualizar(Integer id, Registro reg) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("No se puede actualizar: ID no encontrado");
        }
        reg.setId(id);
        return repo.save(reg);
    }

    public void eliminar(Integer id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("No se puede eliminar: ID no existe");
        }
        repo.deleteById(id);
    }


}