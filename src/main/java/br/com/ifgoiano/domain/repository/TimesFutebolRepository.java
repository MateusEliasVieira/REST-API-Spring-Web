package br.com.ifgoiano.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ifgoiano.domain.model.TimeModel;

@Repository
public interface TimesFutebolRepository extends JpaRepository<TimeModel, Long> {

    @Query("SELECT t FROM TimeModel t where t.time = :nome_time")
    public TimeModel buscarPorNome(@Param("nome_time") String nome);

    @Query("SELECT t.id FROM TimeModel t WHERE LOWER(t.time) = LOWER(:nome_time)")
    public Long buscarIdPorNome(@Param("nome_time") String nome);
}
