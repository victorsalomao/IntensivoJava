package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> buscarTodosOsGames(){
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
    }
}

//Services -> Componente responsável pela lógica de negócio
//Regra que obrigatoriamente tem que acontecer
//Ex: Registrar um pedido de compra -> Registrar um pedido, processar cartão, todas as regras de negócio
//Sempre ficar na camada de serviço.
//Orquestra tudo que for necessário para realizar operação de negócio.
//Tenho que registrar essa classe para componentes serem registrados, ele que sabe instanciar (Framework)
//Como registrar um component? @Component ou @Service
//Sempre precisamos injetar um componente no outro, é como se fosse um import
//Só que isso é dentro da classe, logo o @autowired é pra chamar a classe repositório pra dentro do services.