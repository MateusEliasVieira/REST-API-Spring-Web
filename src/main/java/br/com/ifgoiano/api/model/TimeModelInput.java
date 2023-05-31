package br.com.ifgoiano.api.model;

import java.util.Date;

public class TimeModelInput {
    
    private String time;
    private Date fundacao;
    private String estadio;
    private String principalRival;

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
