package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> buscarTudo(){
        List<GameMinDTO> result = gameService.buscarTodosOsGames();
        return result;
    }
}

//A porta de entrada para o backend -> Ele que disponibiliza a nossa API
//A API é meio que a interface do backend, o frontend chama a API a partir daqui basicamente
//Controlador que expõem que está expondo para o mundo externo
//Mapeando os recursos @requestmapping ---- games no caso o endereço web

//Vou fazer o que mais aqui, vou pegar tod0 mundo que tá na lista e transformar no DTO
//porque no meu DTO foi mapeado quem de fato eu quero na minha API
//SÃO 5 Atributos lá e na minha classe Game eu tenho todos os dados, como se tivesse dizendo
//que dependendo do sistema que eu vou tá me comunicando eu vou mapear para os dados que ele desejar
//Porque isso acaba mudando de acordo com a minha requisição, são métodos diferentes basicamente
//faço isso a partir da linha 21 no método buscartudo()
//stream é uma lib que posso utilizar métodos de conversão e utilizei map
//to instanciando o objeto e depois converto o objeto para lista.
//sendo x uma variável de conversão basicamente é nele que eu armazeno o bojeto
//Service tem que retornar DTO por isso que minha lista retorna DTO

