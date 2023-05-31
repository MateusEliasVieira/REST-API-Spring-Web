package br.com.ifgoiano.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifgoiano.domain.model.TimeModel;
import br.com.ifgoiano.domain.repository.TimesFutebolRepository;
import br.com.ifgoiano.domain.service.TimesFutebolService;

@Service
public class TimesFutebolServiceImpl implements TimesFutebolService {

    // Regras de Negócios e operações com a base de dados

    @Autowired
    private TimesFutebolRepository timesFutebolRepository;

    @Override
    public TimeModel atualizar(TimeModel timeModel) {
        Long id = timesFutebolRepository.buscarIdPorNome(timeModel.getTime());
        timeModel.setId(id);
        return timesFutebolRepository.saveAndFlush(timeModel);
    }

    @Override
    public TimeModel buscarPorNome(String time) {
        if(!time.isEmpty()){
            return timesFutebolRepository.buscarPorNome(time);
        }
        return null;
    }

    @Override
    public List<TimeModel> buscarTodos() {
        return timesFutebolRepository.findAll();
    }

    @Override
    public void deletarPorId(Long id) {
        if(id != null){
            timesFutebolRepository.deleteById(id);
        }
    }

    @Override
    public TimeModel inserir(TimeModel timeModel) {
        if(timesFutebolRepository.buscarPorNome(timeModel.getTime())!=null){
            return null;
        }
        return timesFutebolRepository.save(timeModel);
    }

}
