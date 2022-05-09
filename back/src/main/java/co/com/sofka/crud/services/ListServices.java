package co.com.sofka.crud.services;

import co.com.sofka.crud.entities.Lista;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repositories.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ListServices implements ListService{
    @Autowired
    private ListaRepository listaRepository;

    @Override
    public Lista findById(Long id) {
        return listaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Lista> findAll() {
        return listaRepository.findAll();
    }

    @Override
    public Lista save(Lista lista) {
        listaRepository.save(lista);
        return lista;
    }

    @Override
    public void deleteById(Long id) {
        listaRepository.deleteById(id);
    }
}
