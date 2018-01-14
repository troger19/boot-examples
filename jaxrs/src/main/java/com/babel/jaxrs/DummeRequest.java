package com.babel.jaxrs;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DummeRequest {

    @NotNull
    private String firstName;
    private String lastName;
    @Min(value = 1)
    private Integer size;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
