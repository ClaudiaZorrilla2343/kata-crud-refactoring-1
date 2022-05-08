package co.com.sofka.crud.services;

import co.com.sofka.crud.entities.Todo;

import java.util.List;

public interface TodoServive {

    /**
     * Devuelve un dato de tipo Todo
     * @param id
     * @return
     */
    Todo findById(Long id);

    /**
     * Devuelve todos los datos de tipo Todo
     * @return
     */
    List<Todo> findAll();

    /**
     * Añade a la persistencia el dato de tipo Todo
     * @param todo
     */
    void save(Todo todo);

    /**
     * Elimina de la persistencia un dato de tipo Todo
     * @param id
     */
    void deleteById(Long id);
}
