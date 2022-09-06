package org.alfredo.restdatajpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String sistemaOperativo;
    private String procesador;
    private String ram;
    private int pulgadas;
    private int valor;
    private boolean bluetooth;
    private boolean hdmi;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String sistemaOperativo, String procesador, String ram, int pulgadas, int valor, boolean bluetooth, boolean hdmi) {
        this.id = id;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
        this.pulgadas = pulgadas;
        this.valor = valor;
        this.bluetooth = bluetooth;
        this.hdmi = hdmi;
    }
    public Laptop(String marca, String sistemaOperativo, String procesador, String ram, int pulgadas, int valor, boolean bluetooth, boolean hdmi) {
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
        this.pulgadas = pulgadas;
        this.valor = valor;
        this.bluetooth = bluetooth;
        this.hdmi = hdmi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }
}
