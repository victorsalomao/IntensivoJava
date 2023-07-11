package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}


//Estamos utilizando desenvolvimento orientado a Domínio
//Repository padronizado com a Entitidade de Dominio e sufixo o componente de dominio.