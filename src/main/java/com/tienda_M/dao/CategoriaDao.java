
package com.tienda_M.dao;

import com.tienda_M.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
