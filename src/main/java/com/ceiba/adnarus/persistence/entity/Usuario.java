package com.ceiba.adnarus.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Id
    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "primer_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "administradora_salud")
    private String administradoraSalud;

    @Column(name = "fecha_afiliacion_salud")
    private Date fechaAfiliacionSalud;

    @Column(name = "administradora_pension")
    private String administradoraPension;

    @Column(name = "fecha_afiliacion_pension")
    private Date fechaAfiliacionPension;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getAdministradoraSalud() {
        return administradoraSalud;
    }

    public void setAdministradoraSalud(String administradoraSalud) {
        this.administradoraSalud = administradoraSalud;
    }

    public Date getFechaAfiliacionSalud() {
        return fechaAfiliacionSalud;
    }

    public void setFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
        this.fechaAfiliacionSalud = fechaAfiliacionSalud;
    }

    public String getAdministradoraPension() {
        return administradoraPension;
    }

    public void setAdministradoraPension(String administradoraPension) {
        this.administradoraPension = administradoraPension;
    }

    public Date getFechaAfiliacionPension() {
        return fechaAfiliacionPension;
    }

    public void setFechaAfiliacionPension(Date fechaAfiliacionPension) {
        this.fechaAfiliacionPension = fechaAfiliacionPension;
    }
}
