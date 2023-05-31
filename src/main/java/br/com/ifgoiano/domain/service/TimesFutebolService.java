package br.com.ifgoiano.domain.service;

import java.util.List;

import br.com.ifgoiano.domain.model.TimeModel;

public interface TimesFutebolService {
    
    public TimeModel inserir(TimeModel timeModel);
    public List<TimeModel> buscarTodos();
    public TimeModel buscarPorNome(String time);
    public TimeModel atualizar(TimeModel timeModel);
    public void deletarPorId(Long id);
}
