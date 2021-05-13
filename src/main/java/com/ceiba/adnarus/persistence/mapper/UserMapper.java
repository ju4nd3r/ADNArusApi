package com.ceiba.adnarus.persistence.mapper;

import com.ceiba.adnarus.domain.User;
import com.ceiba.adnarus.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "tipoDocumento", target = "documentType"),
            @Mapping(source = "numeroDocumento", target = "documentNumber"),
            @Mapping(source = "primerNombre", target = "firstName"),
            @Mapping(source = "segundoNombre", target = "secondName"),
            @Mapping(source = "primerApellido", target = "surname"),
            @Mapping(source = "segundoApellido", target = "secondSurname"),
            @Mapping(source = "administradoraSalud", target = "healthAdministrator"),
            @Mapping(source = "fechaAfiliacionSalud", target = "healthAffiliationDate"),
            @Mapping(source = "administradoraPension", target = "pensionAdministrator"),
            @Mapping(source = "fechaAfiliacionPension", target = "pensionAffiliationDate")
    })
    User toUser(Usuario usuario);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
