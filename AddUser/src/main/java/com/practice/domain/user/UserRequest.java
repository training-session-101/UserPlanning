package com.practice.domain.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class UserRequest {
    public UserRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @JsonSerialize
    private String name;
}
