package br.com.ifgoiano.domain.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class TimeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String time;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fundacao;
    private String estadio;
    private String principalRival;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPrincipalRival() {
        return principalRival;
    }

    public void setPrincipalRival(String principalRival) {
        this.principalRival = principalRival;
    }

}
