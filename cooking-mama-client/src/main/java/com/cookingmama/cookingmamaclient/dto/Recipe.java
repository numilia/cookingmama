package com.cookingmama.cookingmamaclient.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@Data

public class Recipe {
    @Id
    private Long id;
    private String name;
    private String howto;
    private String ingredients;
    private Boolean publik;
    private Long userid;

    private float stars;

    public Long getId(){

        return id;
    }
    public void setId(Long id){

        this.id= id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }

    public Boolean getPublik() {
        return publik;
    }

    public void setPublik(Boolean publik) {
        this.publik = publik;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Float getStars() {
        return stars;
    }

    public void setStars(Float stars) {
        this.stars = stars;
    }
}


