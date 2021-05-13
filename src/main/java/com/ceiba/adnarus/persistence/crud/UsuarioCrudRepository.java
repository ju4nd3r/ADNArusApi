package com.ceiba.adnarus.persistence.crud;

import com.ceiba.adnarus.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, String> {
}
