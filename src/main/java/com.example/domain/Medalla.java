package com.example.domain;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;


/**
 * Created by DAM on 20/10/16.
 */
@Entity
public class Medalla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private enumeracion tipomedalla;
    private String especialidad;
    private String competicion;
    @ManyToOne
    private Atleta atleta;

    public Medalla() {
    }

    public Medalla(enumeracion tipomedalla, String especialidad, String competicion, Atleta atleta) {
        this.tipomedalla = tipomedalla;
        this.especialidad = especialidad;
        this.competicion = competicion;
        this.atleta = atleta;
    }

    public long getId() {
        return id;
    }

    public enumeracion getTipomedalla() {
        return tipomedalla;
    }

    public void setTipomedalla(enumeracion tipomedalla) {
        this.tipomedalla = tipomedalla;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", tipomedalla=" + tipomedalla +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
