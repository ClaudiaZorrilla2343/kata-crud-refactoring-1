package co.com.sofka.crud.services;

import co.com.sofka.crud.entities.Lista;

import java.util.List;

public interface ListService {
    /**
     * Devuelve un dato de tipo Todo
     * @param id
     * @return
     */
    Lista findById(Long id);

    /**
     * Devuelve todos los datos de tipo Todo
     * @return
     */
    List<Lista> findAll();

    /**
     * Añade a la persistencia el dato de tipo Todo
     *
     * @param lista
     * @return
     */
    Lista save(Lista lista);

    /**
     * Elimina de la persistencia un dato de tipo List
     * @param id
     */
    void deleteById(Long id);
}
