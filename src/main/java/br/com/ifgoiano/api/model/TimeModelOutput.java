package br.com.ifgoiano.api.model;

import java.util.Date;

public class TimeModelOutput {

    private Long id;
    private String time;
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
