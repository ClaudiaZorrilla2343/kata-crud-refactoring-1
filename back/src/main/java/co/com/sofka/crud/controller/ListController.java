package co.com.sofka.crud.controller;

import co.com.sofka.crud.entities.Lista;

import co.com.sofka.crud.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ListController {

    @Autowired
    private ListService listService;

    @GetMapping(value = "api/list")
    public List<Lista> findAll() {
        return listService.findAll();
    }

    @PostMapping(value = "api/list")
    public Lista save(@RequestBody Lista lista) {
        return listService.save(lista);
    }

    @PutMapping(value = "api/list")
    public Lista update(@RequestBody Lista lista) {
        if (lista.getId() != null) {
            return listService.save(lista);
        }
        throw new RuntimeException("Inexistente");
    }

    @DeleteMapping("/list/{id}")
    public void deleteById(@PathVariable Long id) {
        listService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Lista findById(@PathVariable Long id) {
        return listService.findById(id);
    }



}