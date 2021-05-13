package com.ceiba.adnarus.persistence;

import com.ceiba.adnarus.domain.User;
import com.ceiba.adnarus.domain.repository.UserRepository;
import com.ceiba.adnarus.persistence.crud.UsuarioCrudRepository;
import com.ceiba.adnarus.persistence.entity.Usuario;
import com.ceiba.adnarus.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUsuario(user);
        usuario.setNumeroDocumento(user.getDocumentNumber());
        System.out.println(user.getDocumentNumber());
        System.out.println(user.getFirstName());
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }
}
