package br.com.ifgoiano.api.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifgoiano.api.model.TimeModelInput;
import br.com.ifgoiano.api.model.TimeModelOutput;
import br.com.ifgoiano.domain.model.TimeModel;
import br.com.ifgoiano.domain.service.TimesFutebolService;

@RestController
@RequestMapping(value="/api")
public class TimesController {

    @Autowired
    private TimesFutebolService timesFutebolService;

    //@Autowired
    private ModelMapper mapper = new ModelMapper();

    @GetMapping
    public String getTeste(){
        return "OK";
    }

    @PostMapping("/adicionar")
    public ResponseEntity<TimeModelOutput> inserirNovoTime(@RequestBody TimeModelInput timeModelInput) throws Exception {
        TimeModel timeModel = mapper.map(timeModelInput, TimeModel.class);
        TimeModelOutput timeModelOutput = mapper.map(timesFutebolService.inserir(timeModel), TimeModelOutput.class);
        ResponseEntity<TimeModelOutput> responseEntity = new ResponseEntity<>(timeModelOutput, HttpStatus.CREATED);
        return responseEntity;
    }

    @PutMapping("/atualizar")
    public ResponseEntity<TimeModelOutput> atualizarTime(@RequestBody TimeModelInput timeModelInput){
        TimeModel timeModel = mapper.map(timeModelInput, TimeModel.class);
        TimeModelOutput timeModelOutput = mapper.map(timesFutebolService.atualizar(timeModel), TimeModelOutput.class);
        ResponseEntity<TimeModelOutput> responseEntity = new ResponseEntity<>(timeModelOutput, HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping("/listartodos")
    public ResponseEntity<List<TimeModel>> listarTodosOsTimes(){
        return new ResponseEntity<List<TimeModel>>(timesFutebolService.buscarTodos(),HttpStatus.OK);
    }

    @GetMapping("/listarpornome/{nome}")
    public ResponseEntity<TimeModel> listarPorNome(@PathVariable("nome") String nome){
        return new ResponseEntity<TimeModel>(timesFutebolService.buscarPorNome(nome),HttpStatus.OK);
    }

    @DeleteMapping("/deletarporid/{id}")
    public HttpStatus deletarPorId(@PathVariable("id") Long id){
        timesFutebolService.deletarPorId(id);
        return HttpStatus.OK;
    }

    
    
}
