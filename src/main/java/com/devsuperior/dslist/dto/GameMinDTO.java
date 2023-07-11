package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameMinDTO(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

//Como faço para fazer uma busca no banco de dados através de um API por um endpoint
//Eu gostaria de fazer exatamente isso através do meu sistema, utilizando a estrutura de camadas
//Seguindo a arquitetura de camadas - Repository (de acesso a dados, ele que faz a consulta no banco, ele que traz os dados)
//Devolve isso para uma classe de Services ou componentes de serviços
//E esse serviço devolve para o controlador (DTO)
//Repository -> Responsável por fazer consulta no banco de dados
//JPA Repository