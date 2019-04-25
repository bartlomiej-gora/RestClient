package pl.bgora.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SayHelloResponse {

    @JsonProperty
    private String name;
    @JsonProperty
    private String surname;
    @JsonProperty
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
