package com.jeep.lolesports.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IntegranteHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String summonerId;
    private String accountId;
    private String nombreInvocador;
    private int nivel;

    //solo ranked info
    private String tipoColaRankedSolo;
    private int victoriasRankedSolo;
    private int derrotasRankedSolo;
    private String nivelRankedSolo;
    private String rangoRankedSolo;
    private String nombreLigaRankedSolo;
    private int puntosRankedSolo;

    //flex ranked info
    private String tipoColaRankedFlex;
    private int victoriasRankedFlex;
    private int derrotasRankedFlex;
    private String nivelRankedFlex;
    private String rangoRankedFlex;
    private String nombreLigaRankedFlex;
    private int puntosRankedFlex;

    private Date timestampSaved;

    public IntegranteHistory(Integrante integrante) {
        this.summonerId = integrante.getId();
        this.accountId = integrante.getAccountId();
        this.nombreInvocador = integrante.getNombreInvocador();
        this.nivel = integrante.getNivel();

        //solo ranked info
        this.tipoColaRankedSolo = integrante.getTipoColaRankedSolo();
        this.victoriasRankedSolo = integrante.getVictoriasRankedSolo();
        this.derrotasRankedSolo = integrante.getDerrotasRankedSolo();
        this.nivelRankedSolo = integrante.getNivelRankedSolo();
        this.rangoRankedSolo = integrante.getRangoRankedSolo();
        this.nombreLigaRankedSolo = integrante.getNombreLigaRankedSolo();
        this.puntosRankedSolo = integrante.getPuntosRankedSolo();

        //flex ranked info
        this.tipoColaRankedFlex = integrante.getTipoColaRankedFlex();
        this.victoriasRankedFlex = integrante.getVictoriasRankedFlex();
        this.derrotasRankedFlex = integrante.getDerrotasRankedFlex();
        this.nivelRankedFlex = integrante.getNivelRankedFlex();
        this.rangoRankedFlex = integrante.getRangoRankedFlex();
        this.nombreLigaRankedFlex = integrante.getNombreLigaRankedFlex();
        this.puntosRankedFlex = integrante.getPuntosRankedFlex();

        this.timestampSaved = new Date();
    }

    public IntegranteHistory() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getNombreInvocador() {
        return nombreInvocador;
    }

    public void setNombreInvocador(String nombreInvocador) {
        this.nombreInvocador = nombreInvocador;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipoColaRankedSolo() {
        return tipoColaRankedSolo;
    }

    public void setTipoColaRankedSolo(String tipoColaRankedSolo) {
        this.tipoColaRankedSolo = tipoColaRankedSolo;
    }

    public int getVictoriasRankedSolo() {
        return victoriasRankedSolo;
    }

    public void setVictoriasRankedSolo(int victoriasRankedSolo) {
        this.victoriasRankedSolo = victoriasRankedSolo;
    }

    public int getDerrotasRankedSolo() {
        return derrotasRankedSolo;
    }

    public void setDerrotasRankedSolo(int derrotasRankedSolo) {
        this.derrotasRankedSolo = derrotasRankedSolo;
    }

    public String getNivelRankedSolo() {
        return nivelRankedSolo;
    }

    public void setNivelRankedSolo(String nivelRankedSolo) {
        this.nivelRankedSolo = nivelRankedSolo;
    }

    public String getRangoRankedSolo() {
        return rangoRankedSolo;
    }

    public void setRangoRankedSolo(String rangoRankedSolo) {
        this.rangoRankedSolo = rangoRankedSolo;
    }

    public String getNombreLigaRankedSolo() {
        return nombreLigaRankedSolo;
    }

    public void setNombreLigaRankedSolo(String nombreLigaRankedSolo) {
        this.nombreLigaRankedSolo = nombreLigaRankedSolo;
    }

    public int getPuntosRankedSolo() {
        return puntosRankedSolo;
    }

    public void setPuntosRankedSolo(int puntosRankedSolo) {
        this.puntosRankedSolo = puntosRankedSolo;
    }

    public String getTipoColaRankedFlex() {
        return tipoColaRankedFlex;
    }

    public void setTipoColaRankedFlex(String tipoColaRankedFlex) {
        this.tipoColaRankedFlex = tipoColaRankedFlex;
    }

    public int getVictoriasRankedFlex() {
        return victoriasRankedFlex;
    }

    public void setVictoriasRankedFlex(int victoriasRankedFlex) {
        this.victoriasRankedFlex = victoriasRankedFlex;
    }

    public int getDerrotasRankedFlex() {
        return derrotasRankedFlex;
    }

    public void setDerrotasRankedFlex(int derrotasRankedFlex) {
        this.derrotasRankedFlex = derrotasRankedFlex;
    }

    public String getNivelRankedFlex() {
        return nivelRankedFlex;
    }

    public void setNivelRankedFlex(String nivelRankedFlex) {
        this.nivelRankedFlex = nivelRankedFlex;
    }

    public String getRangoRankedFlex() {
        return rangoRankedFlex;
    }

    public void setRangoRankedFlex(String rangoRankedFlex) {
        this.rangoRankedFlex = rangoRankedFlex;
    }

    public String getNombreLigaRankedFlex() {
        return nombreLigaRankedFlex;
    }

    public void setNombreLigaRankedFlex(String nombreLigaRankedFlex) {
        this.nombreLigaRankedFlex = nombreLigaRankedFlex;
    }

    public int getPuntosRankedFlex() {
        return puntosRankedFlex;
    }

    public void setPuntosRankedFlex(int puntosRankedFlex) {
        this.puntosRankedFlex = puntosRankedFlex;
    }

    public Date getTimestampSaved() {
        return timestampSaved;
    }

    public void setTimestampSaved(Date timestampSaved) {
        this.timestampSaved = timestampSaved;
    }
}
