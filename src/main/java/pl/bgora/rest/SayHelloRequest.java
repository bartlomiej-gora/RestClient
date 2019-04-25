package pl.bgora.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SayHelloRequest {

    @JsonProperty
    private String name;
    @JsonProperty
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }
}
