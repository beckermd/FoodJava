package com.foodnetwork.model;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/19/14
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Persona {

    private String name;

    public Persona(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
